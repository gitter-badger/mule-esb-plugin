/* The following code was generated by JFlex 1.4.3 on 3/18/16 11:19 AM */

package org.mule.lang.raml.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import static org.mule.lang.raml.lexer.RamlTokenTypes.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/18/16 11:19 AM from the specification file
 * <tt>/home/machaval/labs/repos/mule-intellij-plugin/mule-esb-plugin/src/main/java/org/mule/lang/raml/lexer/neon.flex</tt>
 */
public class _RamlLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int IN_ASSIGNMENT_LITERAL = 6;
  public static final int IN_LITERAL = 2;
  public static final int YYINITIAL = 0;
  public static final int IN_ASSIGNMENT = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\15\1\13\1\5\2\22\1\20\16\15\4\33\1\13\1\11\1\3"+
    "\1\7\1\16\2\0\1\1\1\0\1\25\2\0\1\2\1\10\2\0"+
    "\12\17\1\24\2\0\1\32\1\30\2\0\32\16\1\31\1\4\1\27"+
    "\1\0\1\16\1\14\32\16\1\6\1\12\1\26\1\0\6\17\1\23"+
    "\32\17\2\0\4\16\4\0\1\16\2\0\1\17\7\0\1\16\4\0"+
    "\1\16\5\0\27\16\1\0\37\16\1\0\u01ca\16\4\0\14\16\16\0"+
    "\5\16\7\0\1\16\1\0\1\16\21\0\160\17\5\16\1\0\2\16"+
    "\2\0\4\16\10\0\1\16\1\0\3\16\1\0\1\16\1\0\24\16"+
    "\1\0\123\16\1\0\213\16\1\0\5\17\2\0\236\16\11\0\46\16"+
    "\2\0\1\16\7\0\47\16\7\0\1\16\1\0\55\17\1\0\1\17"+
    "\1\0\2\17\1\0\2\17\1\0\1\17\10\0\33\16\5\0\3\16"+
    "\15\0\5\17\6\0\1\16\4\0\13\17\5\0\53\16\37\17\4\0"+
    "\2\16\1\17\143\16\1\0\1\16\10\17\1\0\6\17\2\16\2\17"+
    "\1\0\4\17\2\16\12\17\3\16\2\0\1\16\17\0\1\17\1\16"+
    "\1\17\36\16\33\17\2\0\131\16\13\17\1\16\16\0\12\17\41\16"+
    "\11\17\2\16\4\0\1\16\5\0\26\16\4\17\1\16\11\17\1\16"+
    "\3\17\1\16\5\17\22\0\31\16\3\17\104\0\1\16\1\0\13\16"+
    "\67\0\33\17\1\0\4\17\66\16\3\17\1\16\22\17\1\16\7\17"+
    "\12\16\2\17\2\0\12\17\1\0\7\16\1\0\7\16\1\0\3\17"+
    "\1\0\10\16\2\0\2\16\2\0\26\16\1\0\7\16\1\0\1\16"+
    "\3\0\4\16\2\0\1\17\1\16\7\17\2\0\2\17\2\0\3\17"+
    "\1\16\10\0\1\17\4\0\2\16\1\0\3\16\2\17\2\0\12\17"+
    "\4\16\7\0\1\16\5\0\3\17\1\0\6\16\4\0\2\16\2\0"+
    "\26\16\1\0\7\16\1\0\2\16\1\0\2\16\1\0\2\16\2\0"+
    "\1\17\1\0\5\17\4\0\2\17\2\0\3\17\3\0\1\17\7\0"+
    "\4\16\1\0\1\16\7\0\14\17\3\16\1\17\13\0\3\17\1\0"+
    "\11\16\1\0\3\16\1\0\26\16\1\0\7\16\1\0\2\16\1\0"+
    "\5\16\2\0\1\17\1\16\10\17\1\0\3\17\1\0\3\17\2\0"+
    "\1\16\17\0\2\16\2\17\2\0\12\17\1\0\1\16\17\0\3\17"+
    "\1\0\10\16\2\0\2\16\2\0\26\16\1\0\7\16\1\0\2\16"+
    "\1\0\5\16\2\0\1\17\1\16\7\17\2\0\2\17\2\0\3\17"+
    "\10\0\2\17\4\0\2\16\1\0\3\16\2\17\2\0\12\17\1\0"+
    "\1\16\20\0\1\17\1\16\1\0\6\16\3\0\3\16\1\0\4\16"+
    "\3\0\2\16\1\0\1\16\1\0\2\16\3\0\2\16\3\0\3\16"+
    "\3\0\14\16\4\0\5\17\3\0\3\17\1\0\4\17\2\0\1\16"+
    "\6\0\1\17\16\0\12\17\11\0\1\16\7\0\3\17\1\0\10\16"+
    "\1\0\3\16\1\0\27\16\1\0\12\16\1\0\5\16\3\0\1\16"+
    "\7\17\1\0\3\17\1\0\4\17\7\0\2\17\1\0\2\16\6\0"+
    "\2\16\2\17\2\0\12\17\22\0\2\17\1\0\10\16\1\0\3\16"+
    "\1\0\27\16\1\0\12\16\1\0\5\16\2\0\1\17\1\16\7\17"+
    "\1\0\3\17\1\0\4\17\7\0\2\17\7\0\1\16\1\0\2\16"+
    "\2\17\2\0\12\17\1\0\2\16\17\0\2\17\1\0\10\16\1\0"+
    "\3\16\1\0\51\16\2\0\1\16\7\17\1\0\3\17\1\0\4\17"+
    "\1\16\10\0\1\17\10\0\2\16\2\17\2\0\12\17\12\0\6\16"+
    "\2\0\2\17\1\0\22\16\3\0\30\16\1\0\11\16\1\0\1\16"+
    "\2\0\7\16\3\0\1\17\4\0\6\17\1\0\1\17\1\0\10\17"+
    "\22\0\2\17\15\0\60\16\1\17\2\16\7\17\4\0\10\16\10\17"+
    "\1\0\12\17\47\0\2\16\1\0\1\16\2\0\2\16\1\0\1\16"+
    "\2\0\1\16\6\0\4\16\1\0\7\16\1\0\3\16\1\0\1\16"+
    "\1\0\1\16\2\0\2\16\1\0\4\16\1\17\2\16\6\17\1\0"+
    "\2\17\1\16\2\0\5\16\1\0\1\16\1\0\6\17\2\0\12\17"+
    "\2\0\4\16\40\0\1\16\27\0\2\17\6\0\12\17\13\0\1\17"+
    "\1\0\1\17\1\0\1\17\4\0\2\17\10\16\1\0\44\16\4\0"+
    "\24\17\1\0\2\17\5\16\13\17\1\0\44\17\11\0\1\17\71\0"+
    "\53\16\24\17\1\16\12\17\6\0\6\16\4\17\4\16\3\17\1\16"+
    "\3\17\2\16\7\17\3\16\4\17\15\16\14\17\1\16\17\17\2\0"+
    "\46\16\1\0\1\16\5\0\1\16\2\0\53\16\1\0\u014d\16\1\0"+
    "\4\16\2\0\7\16\1\0\1\16\1\0\4\16\2\0\51\16\1\0"+
    "\4\16\2\0\41\16\1\0\4\16\2\0\7\16\1\0\1\16\1\0"+
    "\4\16\2\0\17\16\1\0\71\16\1\0\4\16\2\0\103\16\2\0"+
    "\3\17\40\0\20\16\20\0\125\16\14\0\u026c\16\2\0\21\16\1\0"+
    "\32\16\5\0\113\16\3\0\3\16\17\0\15\16\1\0\4\16\3\17"+
    "\13\0\22\16\3\17\13\0\22\16\2\17\14\0\15\16\1\0\3\16"+
    "\1\0\2\17\14\0\64\16\40\17\3\0\1\16\3\0\2\16\1\17"+
    "\2\0\12\17\41\0\3\17\2\0\12\17\6\0\130\16\10\0\51\16"+
    "\1\17\1\16\5\0\106\16\12\0\35\16\3\0\14\17\4\0\14\17"+
    "\12\0\12\17\36\16\2\0\5\16\13\0\54\16\4\0\21\17\7\16"+
    "\2\17\6\0\12\17\46\0\27\16\5\17\4\0\65\16\12\17\1\0"+
    "\35\17\2\0\13\17\6\0\12\17\15\0\1\16\130\0\5\17\57\16"+
    "\21\17\7\16\4\0\12\17\21\0\11\17\14\0\3\17\36\16\15\17"+
    "\2\16\12\17\54\16\16\17\14\0\44\16\24\17\10\0\12\17\3\0"+
    "\3\16\12\17\44\16\122\0\3\17\1\0\25\17\4\16\1\17\4\16"+
    "\3\17\2\16\11\0\300\16\47\17\25\0\4\17\u0116\16\2\0\6\16"+
    "\2\0\46\16\2\0\6\16\2\0\10\16\1\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\0\37\16\2\0\65\16\1\0\7\16\1\0\1\16"+
    "\3\0\3\16\1\0\7\16\3\0\4\16\2\0\6\16\4\0\15\16"+
    "\5\0\3\16\1\0\7\16\16\0\5\17\30\0\2\21\5\17\20\0"+
    "\2\16\23\0\1\16\13\0\5\17\5\0\6\17\1\0\1\16\15\0"+
    "\1\16\20\0\15\16\3\0\33\16\25\0\15\17\4\0\1\17\3\0"+
    "\14\17\21\0\1\16\4\0\1\16\2\0\12\16\1\0\1\16\3\0"+
    "\5\16\6\0\1\16\1\0\1\16\1\0\1\16\1\0\4\16\1\0"+
    "\13\16\2\0\4\16\5\0\5\16\4\0\1\16\21\0\51\16\u0a77\0"+
    "\57\16\1\0\57\16\1\0\205\16\6\0\4\16\3\17\2\16\14\0"+
    "\46\16\1\0\1\16\5\0\1\16\2\0\70\16\7\0\1\16\17\0"+
    "\1\17\27\16\11\0\7\16\1\0\7\16\1\0\7\16\1\0\7\16"+
    "\1\0\7\16\1\0\7\16\1\0\7\16\1\0\7\16\1\0\40\17"+
    "\57\0\1\16\u01d5\0\3\16\31\0\11\16\6\17\1\0\5\16\2\0"+
    "\5\16\4\0\126\16\2\0\2\17\2\0\3\16\1\0\132\16\1\0"+
    "\4\16\5\0\51\16\3\0\136\16\21\0\33\16\65\0\20\16\u0200\0"+
    "\u19b6\16\112\0\u51cd\16\63\0\u048d\16\103\0\56\16\2\0\u010d\16\3\0"+
    "\20\16\12\17\2\16\24\0\57\16\1\17\4\0\12\17\1\0\31\16"+
    "\7\0\1\17\120\16\2\17\45\0\11\16\2\0\147\16\2\0\4\16"+
    "\1\0\4\16\14\0\13\16\115\0\12\16\1\17\3\16\1\17\4\16"+
    "\1\17\27\16\5\17\20\0\1\16\7\0\64\16\14\0\2\17\62\16"+
    "\21\17\13\0\12\17\6\0\22\17\6\16\3\0\1\16\4\0\12\17"+
    "\34\16\10\17\2\0\27\16\15\17\14\0\35\16\3\0\4\17\57\16"+
    "\16\17\16\0\1\16\12\17\46\0\51\16\16\17\11\0\3\16\1\17"+
    "\10\16\2\17\2\0\12\17\6\0\27\16\3\0\1\16\1\17\4\0"+
    "\60\16\1\17\1\16\3\17\2\16\2\17\5\16\2\17\1\16\1\17"+
    "\1\16\30\0\3\16\2\0\13\16\5\17\2\0\3\16\2\17\12\0"+
    "\6\16\2\0\6\16\2\0\6\16\11\0\7\16\1\0\7\16\221\0"+
    "\43\16\10\17\1\0\2\17\2\0\12\17\6\0\u2ba4\16\14\0\27\16"+
    "\4\0\61\16\u2104\0\u016e\16\2\0\152\16\46\0\7\16\14\0\5\16"+
    "\5\0\1\16\1\17\12\16\1\0\15\16\1\0\5\16\1\0\1\16"+
    "\1\0\2\16\1\0\2\16\1\0\154\16\41\0\u016b\16\22\0\100\16"+
    "\2\0\66\16\50\0\15\16\3\0\20\17\20\0\7\17\14\0\2\16"+
    "\30\0\3\16\31\0\1\16\6\0\5\16\1\0\207\16\2\0\1\17"+
    "\4\0\1\16\13\0\12\17\7\0\32\16\4\0\1\16\1\0\32\16"+
    "\13\0\131\16\3\0\6\16\2\0\6\16\2\0\6\16\2\0\3\16"+
    "\3\0\2\16\3\0\2\16\22\0\3\17\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\2\2\1\3\1\2\1\4\1\5\1\6"+
    "\1\2\1\7\1\10\1\11\1\7\1\2\1\12\1\13"+
    "\1\10\1\14\1\15\1\16\2\17\1\20\2\21\1\22"+
    "\1\21\1\23\1\24\1\25\1\24\1\1\2\25\1\0"+
    "\1\26\2\0\1\27\1\0\1\27\1\30\2\31\1\32"+
    "\1\0\1\33\2\34\1\0\1\35\4\0\1\36\1\0"+
    "\1\37";

  private static int [] zzUnpackAction() {
    int [] result = new int[61];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\34\0\70\0\124\0\160\0\214\0\160\0\250"+
    "\0\304\0\160\0\340\0\374\0\u0118\0\u0134\0\u0150\0\160"+
    "\0\u016c\0\160\0\160\0\160\0\160\0\160\0\u0188\0\160"+
    "\0\u01a4\0\u01c0\0\160\0\u01dc\0\160\0\u01f8\0\u0214\0\160"+
    "\0\160\0\u0230\0\u024c\0\u0268\0\u024c\0\214\0\160\0\250"+
    "\0\u0284\0\160\0\u02a0\0\u02bc\0\u0118\0\160\0\u02d8\0\160"+
    "\0\u01a4\0\160\0\u02f4\0\160\0\u01dc\0\160\0\u01f8\0\u0310"+
    "\0\u0230\0\u032c\0\u0348\0\u0364\0\160";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[61];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\5\1\6\1\7\1\10\1\5\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\2\20\2\5\1\20\1\5"+
    "\1\20\1\5\1\21\1\5\1\22\1\23\1\24\1\25"+
    "\1\26\1\20\2\27\1\30\2\27\2\30\4\27\1\31"+
    "\1\27\1\30\2\27\1\30\1\27\1\30\1\27\1\32"+
    "\1\27\2\30\3\27\1\30\1\33\1\34\1\35\1\36"+
    "\1\33\3\35\1\33\1\35\1\33\1\37\2\35\2\33"+
    "\1\35\1\33\1\35\3\33\2\35\1\33\3\35\5\40"+
    "\1\41\5\40\1\42\1\40\3\43\1\44\2\41\1\45"+
    "\10\40\34\0\1\46\1\47\1\0\2\46\1\0\26\46"+
    "\2\50\1\0\1\47\1\51\2\0\17\50\1\0\5\50"+
    "\13\0\1\11\20\0\5\13\1\0\26\13\5\0\1\52"+
    "\2\0\1\53\2\0\1\52\4\0\1\54\3\52\21\0"+
    "\2\55\2\0\3\55\3\0\1\55\23\0\1\16\33\0"+
    "\1\17\22\0\1\56\2\0\1\56\5\0\1\56\4\0"+
    "\1\57\3\56\1\0\3\56\4\0\2\27\1\0\2\27"+
    "\2\0\4\27\1\0\1\27\1\0\2\27\1\0\1\27"+
    "\1\0\1\27\1\0\1\27\2\0\3\27\1\0\2\60"+
    "\1\0\2\60\3\0\3\60\1\61\1\60\1\0\2\60"+
    "\1\0\1\60\1\0\1\60\1\0\1\60\2\0\3\60"+
    "\3\0\1\62\2\0\1\62\5\0\1\62\4\0\1\63"+
    "\3\64\1\0\3\62\4\0\1\65\1\66\1\0\2\65"+
    "\1\0\26\65\2\67\1\0\1\66\1\70\2\0\17\67"+
    "\1\0\5\67\13\0\1\37\33\0\1\71\2\0\1\72"+
    "\32\0\3\43\3\0\1\43\15\0\1\41\26\0\5\50"+
    "\1\0\26\50\10\0\1\73\30\0\1\52\33\0\1\56"+
    "\33\0\1\64\26\0\5\67\1\0\26\67\13\0\1\74"+
    "\1\0\3\72\3\0\1\72\6\0\1\75\1\0\5\73"+
    "\1\0\26\73\13\0\1\74\16\0\1\75\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[896];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\1\1\11\1\1\1\11\2\1\1\11\5\1"+
    "\1\11\1\1\5\11\1\1\1\11\2\1\1\11\1\1"+
    "\1\11\2\1\2\11\4\1\1\0\1\11\2\0\1\11"+
    "\1\0\2\1\1\11\1\1\1\11\1\0\1\11\1\1"+
    "\1\11\1\0\1\11\4\0\1\1\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[61];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
    private int yycolumn = 0;
    private int a = 0;
	private void retryInState(int newState) {
        yybegin(newState);
        yypushback(yylength());
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _RamlLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2194) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 8: 
          { return RAML_LINE_CONTINUATION;
          }
        case 32: break;
        case 13: 
          { return RAML_ASSIGNMENT;
          }
        case 33: break;
        case 2: 
          { yybegin(IN_LITERAL);
        return RAML_LITERAL;
          }
        case 34: break;
        case 9: 
          { return RAML_WHITESPACE;
          }
        case 35: break;
        case 24: 
          { return RAML_TAG;
          }
        case 36: break;
        case 25: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { return RAML_COLON;
          }
        case 37: break;
        case 12: 
          { return RAML_LBRACE_SQUARE;
          }
        case 38: break;
        case 11: 
          { return RAML_RBRACE_SQUARE;
          }
        case 39: break;
        case 18: 
          { a=406;retryInState(YYINITIAL);
          }
        case 40: break;
        case 1: 
          { a=504;
          }
        case 41: break;
        case 19: 
          { a=403;return RAML_WHITESPACE;
          }
        case 42: break;
        case 17: 
          { return RAML_LITERAL;
          }
        case 43: break;
        case 14: 
          { a=302;
          }
        case 44: break;
        case 7: 
          { return RAML_UNKNOWN;
          }
        case 45: break;
        case 6: 
          { return RAML_COMMENT;
          }
        case 46: break;
        case 5: 
          { return RAML_LBRACE_CURLY;
          }
        case 47: break;
        case 10: 
          { return RAML_RBRACE_CURLY;
          }
        case 48: break;
        case 27: 
          { a=304;retryInState(YYINITIAL);
          }
        case 49: break;
        case 29: 
          { a=401;return RAML_STRING;
          }
        case 50: break;
        case 30: 
          { return RAML_HEADER;
          }
        case 51: break;
        case 20: 
          { a=505;
          }
        case 52: break;
        case 28: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { a=305;retryInState(YYINITIAL);
          }
        case 53: break;
        case 26: 
          { a=303;
          }
        case 54: break;
        case 16: 
          { a=306;
          }
        case 55: break;
        case 31: 
          { a=501; retryInState(IN_ASSIGNMENT);
          }
        case 56: break;
        case 22: 
          { return RAML_STRING;
          }
        case 57: break;
        case 4: 
          { return RAML_INDENT;
          }
        case 58: break;
        case 21: 
          { a=503;retryInState(IN_ASSIGNMENT);
          }
        case 59: break;
        case 23: 
          // lookahead expression with fixed base length
          zzMarkedPos = zzStartRead + 1;
          { return RAML_ARRAY_BULLET;
          }
        case 60: break;
        case 15: 
          { a=307;retryInState(YYINITIAL);
          }
        case 61: break;
        case 3: 
          { return RAML_ITEM_DELIMITER;
          }
        case 62: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
