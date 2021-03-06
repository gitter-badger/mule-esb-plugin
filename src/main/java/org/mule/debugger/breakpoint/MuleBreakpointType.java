package org.mule.debugger.breakpoint;

import com.intellij.openapi.editor.Document;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.fileTypes.StdFileTypes;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiDocumentManager;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.xml.XmlTag;
import com.intellij.xdebugger.XDebuggerUtil;
import com.intellij.xdebugger.XSourcePosition;
import com.intellij.xdebugger.breakpoints.XBreakpointProperties;
import com.intellij.xdebugger.breakpoints.XLineBreakpoint;
import com.intellij.xdebugger.breakpoints.XLineBreakpointType;
import com.intellij.xdebugger.evaluation.XDebuggerEditorsProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.mule.util.MuleElementType;
import org.mule.util.MuleConfigUtils;


public class MuleBreakpointType extends XLineBreakpointType<XBreakpointProperties> {
    protected MuleBreakpointType() {
        super("mule", "Mule Breakpoints");
    }

    @Override
    public boolean canPutAt(@NotNull VirtualFile file, int line, @NotNull Project project) {
        final Document document = FileDocumentManager.getInstance().getDocument(file);
        if (document == null) return false;

        final PsiFile psiFile = PsiDocumentManager.getInstance(project).getPsiFile(document);
        if (psiFile == null) {
            return false;
        }
        final FileType fileType = psiFile.getFileType();
        final boolean isMuleAndXml = fileType == StdFileTypes.XML && MuleConfigUtils.isMuleFile(psiFile);
        if (!isMuleAndXml) {
            return false;
        } else {
            final XmlTag xmlTagAt = MuleConfigUtils.getXmlTagAt(project, XDebuggerUtil.getInstance().createPosition(file, line));
            if (xmlTagAt == null) {
                return false;
            } else {
                return MuleConfigUtils.getMuleElementTypeFromXmlElement(xmlTagAt) == MuleElementType.MESSAGE_PROCESSOR;
            }
        }
    }

    @Override
    public XDebuggerEditorsProvider getEditorsProvider(@NotNull XLineBreakpoint<XBreakpointProperties> breakpoint, @NotNull Project project) {
        final XSourcePosition position = breakpoint.getSourcePosition();
        if (position == null) {
            return null;
        }

        final PsiFile file = PsiManager.getInstance(project).findFile(position.getFile());
        if (file == null) {
            return null;
        }

        return new MuleDebuggerEditorsProvider();
    }

    @Nullable
    @Override
    public XBreakpointProperties createBreakpointProperties(@NotNull VirtualFile virtualFile, int i) {
        return null;
    }


}
