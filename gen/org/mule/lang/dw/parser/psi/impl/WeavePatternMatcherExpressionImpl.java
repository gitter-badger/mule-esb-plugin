// This is a generated file. Not intended for manual editing.
package org.mule.lang.dw.parser.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.mule.lang.dw.parser.psi.WeaveTypes.*;
import org.mule.lang.dw.parser.psi.*;

public class WeavePatternMatcherExpressionImpl extends WeaveExpressionImpl implements WeavePatternMatcherExpression {

  public WeavePatternMatcherExpressionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof WeaveVisitor) ((WeaveVisitor)visitor).visitPatternMatcherExpression(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<WeavePattern> getPatternList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, WeavePattern.class);
  }

}
