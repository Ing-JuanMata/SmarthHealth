/* The following code was generated by JFlex 1.4.3 on 06/05/22 17:01 */

package codigo;

import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 06/05/22 17:01 from the specification file
 * <tt>B:/TEC/SEMESTRE_7/AUTOMATAS_1/SmartHealth_V4/SmartHealth_V3/SmartHealth/src/codigo/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\5\2\0\1\3\22\0\1\3\1\51\1\6\2\0"+
    "\1\53\1\47\1\65\1\54\1\55\1\46\1\44\1\63\1\45\1\64"+
    "\1\4\12\2\1\0\1\62\1\52\1\43\1\52\2\0\1\7\1\1"+
    "\1\40\1\32\1\14\6\1\1\41\5\1\1\37\1\31\7\1\1\60"+
    "\1\0\1\61\1\0\1\1\1\0\1\12\1\17\1\23\1\16\1\20"+
    "\1\27\1\21\1\24\1\22\2\1\1\11\1\35\1\15\1\26\1\34"+
    "\1\1\1\25\1\13\1\10\1\30\1\33\1\1\1\42\1\36\1\1"+
    "\1\56\1\50\1\57\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\22\2\1\10\3\5\1\11\1\1\1\11\1\12\1\1"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\2\1\1\0\1\4\1\23\1\0\1\2\1\24\10\2"+
    "\1\25\17\2\1\12\1\26\1\11\2\0\1\27\1\30"+
    "\5\2\1\31\10\2\1\32\14\2\2\0\1\33\1\2"+
    "\1\34\11\2\1\35\1\2\1\36\1\37\12\2\1\3"+
    "\1\0\1\1\1\40\1\41\1\42\1\43\5\2\1\44"+
    "\5\2\1\45\1\46\4\2\1\0\4\2\1\47\3\2"+
    "\1\50\1\2\1\51\1\2\1\52\1\2\1\27\10\2"+
    "\1\53\2\2\1\54\1\55\4\2\1\56\3\2\1\57"+
    "\1\60\1\61\1\62\5\2\1\63\1\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[209];
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
    "\0\0\0\66\0\154\0\242\0\330\0\u010e\0\66\0\u0144"+
    "\0\u017a\0\u01b0\0\u01e6\0\u021c\0\u0252\0\u0288\0\u02be\0\u02f4"+
    "\0\u032a\0\u0360\0\u0396\0\u03cc\0\u0402\0\u0438\0\u046e\0\u04a4"+
    "\0\u04da\0\u0510\0\u0546\0\u057c\0\u05b2\0\u05e8\0\u061e\0\u0654"+
    "\0\u0546\0\u0546\0\u05e8\0\u068a\0\66\0\66\0\66\0\66"+
    "\0\66\0\66\0\66\0\u06c0\0\u06f6\0\u072c\0\u0762\0\66"+
    "\0\u0798\0\u07ce\0\154\0\u0804\0\u083a\0\u0870\0\u08a6\0\u08dc"+
    "\0\u0912\0\u0948\0\u097e\0\u09b4\0\u09ea\0\u0a20\0\u0a56\0\u0a8c"+
    "\0\u0ac2\0\u0af8\0\u0b2e\0\u0b64\0\u0b9a\0\u0bd0\0\u0c06\0\u0c3c"+
    "\0\u0c72\0\u0ca8\0\u0cde\0\66\0\66\0\66\0\u0d14\0\u0d4a"+
    "\0\u072c\0\u0798\0\u0d80\0\u0db6\0\u0dec\0\u0e22\0\u0e58\0\154"+
    "\0\u0e8e\0\u0ec4\0\u0efa\0\u0f30\0\u0f66\0\u0f9c\0\u0fd2\0\u1008"+
    "\0\154\0\u103e\0\u1074\0\u10aa\0\u10e0\0\u1116\0\u114c\0\u1182"+
    "\0\u11b8\0\u11ee\0\u1224\0\u125a\0\u1290\0\u12c6\0\u12fc\0\u12fc"+
    "\0\u1332\0\154\0\u1368\0\u139e\0\u13d4\0\u140a\0\u1440\0\u1476"+
    "\0\u14ac\0\u14e2\0\u1518\0\154\0\u154e\0\154\0\154\0\u1584"+
    "\0\u15ba\0\u15f0\0\u1626\0\u165c\0\u1692\0\u16c8\0\u16fe\0\u1734"+
    "\0\u176a\0\66\0\u17a0\0\u12fc\0\154\0\154\0\154\0\154"+
    "\0\u17d6\0\u180c\0\u1842\0\u1878\0\u18ae\0\154\0\u18e4\0\u191a"+
    "\0\u1950\0\u1986\0\u19bc\0\154\0\154\0\u19f2\0\u1a28\0\u1a5e"+
    "\0\u1a94\0\u1aca\0\u1b00\0\u1b36\0\u1b6c\0\u1ba2\0\154\0\u1bd8"+
    "\0\u1c0e\0\u1c44\0\154\0\u1c7a\0\154\0\u1cb0\0\154\0\u1ce6"+
    "\0\66\0\u1d1c\0\u1d52\0\u1d88\0\u1dbe\0\u1df4\0\u1e2a\0\u1e60"+
    "\0\u1e96\0\154\0\u1ecc\0\u1f02\0\154\0\154\0\u1f38\0\u1f6e"+
    "\0\u1fa4\0\u1fda\0\154\0\u2010\0\u2046\0\u207c\0\154\0\154"+
    "\0\154\0\154\0\u20b2\0\u20e8\0\u211e\0\u2154\0\u218a\0\154"+
    "\0\154";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[209];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\3\1\17\1\20"+
    "\1\21\1\3\1\22\1\23\1\3\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\7\3\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\47\1\50\1\51\1\52\1\53\1\2\1\54"+
    "\67\0\2\3\4\0\34\3\24\0\1\55\1\4\4\0"+
    "\34\55\21\0\1\56\4\0\1\5\66\0\1\57\36\0"+
    "\1\60\22\0\5\61\1\0\60\61\1\0\2\3\4\0"+
    "\1\3\1\62\2\3\1\63\27\3\24\0\2\3\4\0"+
    "\16\3\1\64\15\3\24\0\2\3\4\0\17\3\1\65"+
    "\14\3\24\0\2\3\4\0\7\3\1\66\24\3\24\0"+
    "\2\3\4\0\1\3\1\67\32\3\24\0\2\3\4\0"+
    "\6\3\1\70\25\3\24\0\2\3\4\0\11\3\1\71"+
    "\1\3\1\72\2\3\1\73\1\74\14\3\24\0\2\3"+
    "\4\0\11\3\1\75\22\3\24\0\2\3\4\0\2\3"+
    "\1\76\23\3\1\77\4\3\1\100\24\0\2\3\4\0"+
    "\6\3\1\101\25\3\24\0\2\3\4\0\15\3\1\102"+
    "\1\3\1\103\14\3\24\0\2\3\4\0\11\3\1\104"+
    "\22\3\24\0\2\3\4\0\25\3\1\105\6\3\24\0"+
    "\2\3\4\0\2\3\1\106\1\107\30\3\24\0\2\3"+
    "\4\0\6\3\1\110\25\3\24\0\2\3\4\0\1\3"+
    "\1\111\32\3\24\0\2\3\4\0\11\3\1\112\22\3"+
    "\24\0\2\3\4\0\11\3\1\113\22\3\66\0\1\114"+
    "\65\0\1\60\1\115\64\0\1\60\1\0\1\115\63\0"+
    "\1\60\71\0\1\116\66\0\1\116\62\0\1\117\20\0"+
    "\5\120\1\0\60\120\1\0\1\55\5\0\34\55\25\0"+
    "\1\121\63\0\5\57\1\0\60\57\5\61\1\0\1\122"+
    "\57\61\1\0\2\3\4\0\2\3\1\123\31\3\24\0"+
    "\2\3\4\0\21\3\1\124\12\3\24\0\2\3\4\0"+
    "\12\3\1\125\21\3\24\0\2\3\4\0\26\3\1\126"+
    "\5\3\24\0\2\3\4\0\3\3\1\127\30\3\24\0"+
    "\2\3\4\0\7\3\1\130\24\3\24\0\2\3\4\0"+
    "\24\3\1\131\7\3\24\0\2\3\4\0\4\3\1\132"+
    "\27\3\24\0\2\3\4\0\13\3\1\133\20\3\24\0"+
    "\2\3\4\0\21\3\1\134\12\3\24\0\2\3\4\0"+
    "\12\3\1\135\21\3\24\0\2\3\4\0\4\3\1\136"+
    "\27\3\24\0\2\3\4\0\25\3\1\137\6\3\24\0"+
    "\2\3\4\0\13\3\1\140\20\3\24\0\2\3\4\0"+
    "\1\3\1\141\32\3\24\0\2\3\4\0\3\3\1\142"+
    "\30\3\24\0\2\3\4\0\6\3\1\143\25\3\24\0"+
    "\2\3\4\0\12\3\1\144\21\3\24\0\2\3\4\0"+
    "\1\3\1\145\7\3\1\146\22\3\24\0\2\3\4\0"+
    "\17\3\1\147\14\3\24\0\2\3\4\0\2\3\1\150"+
    "\31\3\24\0\2\3\4\0\1\3\1\151\32\3\24\0"+
    "\2\3\4\0\16\3\1\152\15\3\24\0\2\3\4\0"+
    "\14\3\1\153\7\3\1\154\7\3\24\0\2\3\4\0"+
    "\6\3\1\155\25\3\25\0\1\156\63\0\5\157\1\0"+
    "\57\157\1\160\1\0\2\3\4\0\3\3\1\161\30\3"+
    "\24\0\2\3\4\0\11\3\1\162\22\3\24\0\2\3"+
    "\4\0\13\3\1\163\20\3\24\0\2\3\4\0\13\3"+
    "\1\164\20\3\24\0\2\3\4\0\16\3\1\165\15\3"+
    "\24\0\2\3\4\0\13\3\1\166\20\3\24\0\2\3"+
    "\4\0\1\3\1\167\23\3\1\170\6\3\24\0\2\3"+
    "\4\0\24\3\1\171\7\3\24\0\2\3\4\0\10\3"+
    "\1\172\23\3\24\0\2\3\4\0\13\3\1\173\20\3"+
    "\24\0\2\3\4\0\11\3\1\174\22\3\24\0\2\3"+
    "\4\0\1\3\1\175\32\3\24\0\2\3\4\0\1\3"+
    "\1\176\32\3\24\0\2\3\4\0\16\3\1\177\15\3"+
    "\24\0\2\3\4\0\7\3\1\200\24\3\24\0\2\3"+
    "\4\0\13\3\1\201\20\3\24\0\2\3\4\0\13\3"+
    "\1\202\20\3\24\0\2\3\4\0\6\3\1\203\25\3"+
    "\24\0\2\3\4\0\3\3\1\204\30\3\24\0\2\3"+
    "\4\0\4\3\1\124\27\3\24\0\2\3\4\0\13\3"+
    "\1\205\20\3\24\0\2\3\4\0\13\3\1\206\20\3"+
    "\24\0\2\3\4\0\2\3\1\207\31\3\24\0\2\3"+
    "\4\0\13\3\1\210\20\3\24\0\2\3\4\0\1\3"+
    "\1\211\32\3\25\0\1\156\52\0\1\212\6\0\1\213"+
    "\1\0\5\157\1\0\57\157\1\214\1\0\2\3\4\0"+
    "\4\3\1\215\27\3\24\0\2\3\4\0\14\3\1\216"+
    "\17\3\24\0\2\3\4\0\1\3\1\217\32\3\24\0"+
    "\2\3\4\0\1\3\1\220\32\3\24\0\2\3\4\0"+
    "\14\3\1\221\17\3\24\0\2\3\4\0\3\3\1\222"+
    "\30\3\24\0\2\3\4\0\11\3\1\223\22\3\24\0"+
    "\2\3\4\0\11\3\1\224\22\3\24\0\2\3\4\0"+
    "\2\3\1\225\31\3\24\0\2\3\4\0\6\3\1\226"+
    "\25\3\24\0\2\3\4\0\27\3\1\227\4\3\24\0"+
    "\2\3\4\0\13\3\1\230\20\3\24\0\2\3\4\0"+
    "\4\3\1\231\27\3\24\0\2\3\4\0\17\3\1\232"+
    "\14\3\24\0\2\3\4\0\23\3\1\233\10\3\24\0"+
    "\2\3\4\0\1\3\1\234\32\3\24\0\2\3\4\0"+
    "\2\3\1\235\31\3\24\0\2\3\4\0\6\3\1\236"+
    "\25\3\24\0\2\3\4\0\3\3\1\237\30\3\24\0"+
    "\2\3\4\0\14\3\1\240\17\3\24\0\2\3\4\0"+
    "\13\3\1\241\20\3\25\0\1\242\64\0\2\3\4\0"+
    "\11\3\1\243\22\3\24\0\2\3\4\0\6\3\1\244"+
    "\25\3\24\0\2\3\4\0\6\3\1\245\25\3\24\0"+
    "\2\3\4\0\16\3\1\246\15\3\24\0\2\3\4\0"+
    "\11\3\1\247\22\3\24\0\2\3\4\0\30\3\1\250"+
    "\3\3\24\0\2\3\4\0\1\3\1\251\32\3\24\0"+
    "\2\3\4\0\1\3\1\252\32\3\24\0\2\3\4\0"+
    "\6\3\1\253\25\3\24\0\2\3\4\0\17\3\1\254"+
    "\14\3\24\0\2\3\4\0\12\3\1\255\21\3\24\0"+
    "\2\3\4\0\16\3\1\256\15\3\24\0\2\3\4\0"+
    "\11\3\1\257\22\3\24\0\2\3\4\0\2\3\1\260"+
    "\31\3\25\0\1\242\52\0\1\261\11\0\2\3\4\0"+
    "\31\3\1\262\2\3\24\0\2\3\4\0\14\3\1\263"+
    "\17\3\24\0\2\3\4\0\4\3\1\264\27\3\24\0"+
    "\2\3\4\0\32\3\1\265\1\3\24\0\2\3\4\0"+
    "\17\3\1\266\14\3\24\0\2\3\4\0\13\3\1\267"+
    "\20\3\24\0\2\3\4\0\11\3\1\270\22\3\24\0"+
    "\2\3\4\0\17\3\1\271\14\3\24\0\2\3\4\0"+
    "\11\3\1\272\22\3\24\0\2\3\4\0\3\3\1\273"+
    "\30\3\24\0\2\3\4\0\17\3\1\274\14\3\24\0"+
    "\2\3\4\0\11\3\1\275\22\3\24\0\2\3\4\0"+
    "\11\3\1\276\22\3\24\0\2\3\4\0\13\3\1\277"+
    "\20\3\24\0\2\3\4\0\17\3\1\300\14\3\24\0"+
    "\2\3\4\0\17\3\1\301\14\3\24\0\2\3\4\0"+
    "\16\3\1\302\15\3\24\0\2\3\4\0\16\3\1\303"+
    "\15\3\24\0\2\3\4\0\1\3\1\304\32\3\24\0"+
    "\2\3\4\0\6\3\1\305\25\3\24\0\2\3\4\0"+
    "\12\3\1\306\21\3\24\0\2\3\4\0\26\3\1\307"+
    "\5\3\24\0\2\3\4\0\6\3\1\310\25\3\24\0"+
    "\2\3\4\0\1\311\33\3\24\0\2\3\4\0\11\3"+
    "\1\312\22\3\24\0\2\3\4\0\1\3\1\313\32\3"+
    "\24\0\2\3\4\0\15\3\1\314\16\3\24\0\2\3"+
    "\4\0\16\3\1\315\15\3\24\0\2\3\4\0\1\3"+
    "\1\316\32\3\24\0\2\3\4\0\17\3\1\317\14\3"+
    "\24\0\2\3\4\0\4\3\1\320\27\3\24\0\2\3"+
    "\4\0\2\3\1\321\31\3\23\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8640];
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
    "\1\0\1\11\4\1\1\11\35\1\7\11\2\1\1\0"+
    "\1\1\1\11\1\0\32\1\3\11\2\0\35\1\2\0"+
    "\32\1\1\11\1\0\26\1\1\0\16\1\1\11\40\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[209];
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
  
  Pintar pintar = new Pintar();

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
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
    while (i < 148) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
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
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
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
    return zzBuffer[zzStartRead+pos];
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
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
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
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
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
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 53: break;
        case 17: 
          { lexeme=yytext(); return P_coma;
          }
        case 54: break;
        case 43: 
          { lexeme=yytext(); return Declare;
          }
        case 55: break;
        case 13: 
          { lexeme=yytext(); return Llave_a;
          }
        case 56: break;
        case 29: 
          { lexeme=yytext(); return Else;
          }
        case 57: break;
        case 24: 
          { lexeme=yytext(); return Texto;
          }
        case 58: break;
        case 6: 
          { return Linea;
          }
        case 59: break;
        case 40: 
          { lexeme=yytext(); return Option;
          }
        case 60: break;
        case 32: 
          { lexeme=yytext(); return Atlas;
          }
        case 61: break;
        case 45: 
          { lexeme=yytext(); return Dispense;
          }
        case 62: break;
        case 42: 
          { lexeme=yytext(); return Device;
          }
        case 63: break;
        case 10: 
          { lexeme = yytext(); return Op_relacional;
          }
        case 64: break;
        case 9: 
          { lexeme=yytext(); return Op_logico;
          }
        case 65: break;
        case 19: 
          { lexeme = yytext(); return Op_atribucion;
          }
        case 66: break;
        case 22: 
          { lexeme = yytext(); return Op_incremento;
          }
        case 67: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 68: break;
        case 14: 
          { lexeme=yytext(); return Llave_c;
          }
        case 69: break;
        case 11: 
          { lexeme=yytext(); return Parentesis_a;
          }
        case 70: break;
        case 7: 
          { lexeme=yytext(); return Comillas;
          }
        case 71: break;
        case 36: 
          { lexeme=yytext(); return Begin;
          }
        case 72: break;
        case 15: 
          { lexeme = yytext(); return Corchete_a;
          }
        case 73: break;
        case 25: 
          { lexeme=yytext(); return End;
          }
        case 74: break;
        case 33: 
          { lexeme=yytext(); return Logic;
          }
        case 75: break;
        case 51: 
          { lexeme=yytext(); return DriverLights ;
          }
        case 76: break;
        case 41: 
          { lexeme=yytext(); return Cadena;
          }
        case 77: break;
        case 21: 
          { lexeme=yytext(); return Do;
          }
        case 78: break;
        case 20: 
          { lexeme=yytext(); return As;
          }
        case 79: break;
        case 44: 
          { lexeme=yytext(); return Distance ;
          }
        case 80: break;
        case 5: 
          { lexeme=yytext(); return Aritmetico;
          }
        case 81: break;
        case 35: 
          { lexeme=yytext(); return Start;
          }
        case 82: break;
        case 34: 
          { lexeme=yytext(); return Admit;
          }
        case 83: break;
        case 1: 
          { lexeme=yytext(); return ERROR;
          }
        case 84: break;
        case 52: 
          { lexeme=yytext(); return DeviceControl ;
          }
        case 85: break;
        case 12: 
          { lexeme=yytext(); return Parentesis_c;
          }
        case 86: break;
        case 39: 
          { lexeme=yytext(); return Double;
          }
        case 87: break;
        case 38: 
          { lexeme=yytext(); return Until;
          }
        case 88: break;
        case 50: 
          { lexeme=yytext(); return Ventilate;
          }
        case 89: break;
        case 16: 
          { lexeme = yytext(); return Corchete_c;
          }
        case 90: break;
        case 30: 
          { lexeme=yytext(); return Exit ;
          }
        case 91: break;
        case 48: 
          { lexeme=yytext(); return Condition;
          }
        case 92: break;
        case 31: 
          { lexeme=yytext(); return Char;
          }
        case 93: break;
        case 27: 
          { lexeme=yytext(); return Caracter;
          }
        case 94: break;
        case 8: 
          { lexeme=yytext(); return Igual;
          }
        case 95: break;
        case 37: 
          { lexeme=yytext(); return Float;
          }
        case 96: break;
        case 18: 
          { lexeme=yytext(); return Coma;
          }
        case 97: break;
        case 23: 
          { lexeme=yytext(); return Numero_Dec;
          }
        case 98: break;
        case 4: 
          { /*Ignore*/
          }
        case 99: break;
        case 26: 
          { lexeme=yytext(); return Int;
          }
        case 100: break;
        case 28: 
          { lexeme = yytext(); return Op_booleano;
          }
        case 101: break;
        case 46: 
          { lexeme=yytext(); return OpenDoor ;
          }
        case 102: break;
        case 49: 
          { lexeme=yytext(); return RegisterA ;
          }
        case 103: break;
        case 47: 
          { lexeme=yytext(); return EmptyRoom;
          }
        case 104: break;
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
