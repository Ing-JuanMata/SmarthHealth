/* The following code was generated by JFlex 1.4.3 on 06/05/22 17:01 */

package codigo;

import java_cup.runtime.Symbol;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 06/05/22 17:01 from the specification file
 * <tt>B:/TEC/SEMESTRE_7/AUTOMATAS_1/SmartHealth_V4/SmartHealth_V3/SmartHealth/src/codigo/LexerCup.flex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

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
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  5,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 40,  6,  0,  0, 43, 38, 54, 44, 45, 37, 35, 51, 36, 53,  4, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 52, 50, 42, 34, 41,  0, 
     0,  7,  1, 25, 26, 12,  1,  1,  1,  1,  1,  1, 32,  1,  1,  1, 
     1,  1, 31,  1,  1,  1,  1,  1,  1,  1,  1, 48,  0, 49,  0,  1, 
     0, 10, 15, 19, 14, 16, 23, 17, 20, 18,  1,  1,  9, 29, 13, 22, 
    28,  1, 21, 11,  8, 24, 27,  1, 33, 30,  1, 46, 39, 47,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\22\1\1\6"+
    "\3\4\3\7\2\10\1\0\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\2\0\1\3\1\22"+
    "\1\0\1\1\1\23\10\1\1\24\20\1\1\10\1\25"+
    "\1\7\2\0\1\26\1\27\5\1\1\30\10\1\1\31"+
    "\15\1\1\0\1\32\1\1\1\33\11\1\1\34\1\1"+
    "\1\35\1\36\6\1\1\37\4\1\1\2\1\0\1\40"+
    "\1\41\1\42\1\43\5\1\1\44\5\1\1\45\1\46"+
    "\1\47\3\1\1\0\4\1\1\50\3\1\1\51\2\1"+
    "\1\52\1\1\1\26\10\1\1\53\2\1\1\54\1\55"+
    "\4\1\1\56\3\1\1\57\1\60\1\61\1\62\5\1"+
    "\1\63\1\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[208];
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
    "\0\0\0\67\0\156\0\245\0\334\0\u0113\0\u014a\0\u0181"+
    "\0\u01b8\0\u01ef\0\u0226\0\u025d\0\u0294\0\u02cb\0\u0302\0\u0339"+
    "\0\u0370\0\u03a7\0\u03de\0\u0415\0\u044c\0\u0483\0\u04ba\0\u04f1"+
    "\0\u0528\0\u055f\0\u0596\0\u05cd\0\u0604\0\u063b\0\u0528\0\u0672"+
    "\0\u06a9\0\u05cd\0\u06e0\0\u0717\0\u0717\0\u0717\0\u0717\0\u0717"+
    "\0\u0717\0\u0717\0\u0717\0\u074e\0\u0785\0\u07bc\0\u0717\0\u07f3"+
    "\0\u082a\0\67\0\u0861\0\u0898\0\u08cf\0\u0906\0\u093d\0\u0974"+
    "\0\u09ab\0\u09e2\0\u0a19\0\u0a50\0\u0a87\0\u0abe\0\u0af5\0\u0b2c"+
    "\0\u0b63\0\u0b9a\0\u0bd1\0\u0c08\0\u0c3f\0\u0c76\0\u0cad\0\u0ce4"+
    "\0\u0d1b\0\u0d52\0\u0d89\0\u0717\0\u0717\0\u0717\0\u0dc0\0\u0df7"+
    "\0\u0785\0\u07f3\0\u0e2e\0\u0e65\0\u0e9c\0\u0ed3\0\u0f0a\0\67"+
    "\0\u0f41\0\u0f78\0\u0faf\0\u0fe6\0\u101d\0\u1054\0\u108b\0\u10c2"+
    "\0\67\0\u10f9\0\u1130\0\u1167\0\u119e\0\u11d5\0\u120c\0\u1243"+
    "\0\u127a\0\u12b1\0\u12e8\0\u131f\0\u1356\0\u138d\0\u13c4\0\u0717"+
    "\0\u13fb\0\67\0\u1432\0\u1469\0\u14a0\0\u14d7\0\u150e\0\u1545"+
    "\0\u157c\0\u15b3\0\u15ea\0\67\0\u1621\0\67\0\67\0\u1658"+
    "\0\u168f\0\u16c6\0\u16fd\0\u1734\0\u176b\0\67\0\u17a2\0\u17d9"+
    "\0\u1810\0\u1847\0\u0717\0\u187e\0\67\0\67\0\67\0\67"+
    "\0\u18b5\0\u18ec\0\u1923\0\u195a\0\u1991\0\67\0\u19c8\0\u19ff"+
    "\0\u1a36\0\u1a6d\0\u1aa4\0\67\0\67\0\67\0\u1adb\0\u1b12"+
    "\0\u1b49\0\u1b80\0\u1bb7\0\u1bee\0\u1c25\0\u1c5c\0\67\0\u1c93"+
    "\0\u1cca\0\u1d01\0\67\0\u1d38\0\u1d6f\0\67\0\u1da6\0\u0717"+
    "\0\u1ddd\0\u1e14\0\u1e4b\0\u1e82\0\u1eb9\0\u1ef0\0\u1f27\0\u1f5e"+
    "\0\67\0\u1f95\0\u1fcc\0\67\0\67\0\u2003\0\u203a\0\u2071"+
    "\0\u20a8\0\67\0\u20df\0\u2116\0\u214d\0\67\0\67\0\67"+
    "\0\67\0\u2184\0\u21bb\0\u21f2\0\u2229\0\u2260\0\67\0\67";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[208];
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
    "\1\0\1\2\1\3\1\4\1\5\1\4\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\2\1\15\1\16"+
    "\1\17\1\2\1\20\1\21\1\2\1\22\1\23\1\24"+
    "\1\25\1\26\1\27\1\30\6\2\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\0\1\54\1\0\2\2\4\0\33\2\27\0\1\3"+
    "\62\0\1\55\4\0\1\4\1\0\1\4\65\0\1\56"+
    "\35\0\1\57\24\0\5\60\1\0\61\60\1\0\2\2"+
    "\4\0\1\2\1\61\2\2\1\62\26\2\26\0\2\2"+
    "\4\0\16\2\1\63\14\2\26\0\2\2\4\0\17\2"+
    "\1\64\13\2\26\0\2\2\4\0\7\2\1\65\23\2"+
    "\26\0\2\2\4\0\1\2\1\66\31\2\26\0\2\2"+
    "\4\0\6\2\1\67\24\2\26\0\2\2\4\0\11\2"+
    "\1\70\1\2\1\71\2\2\1\72\1\73\13\2\26\0"+
    "\2\2\4\0\11\2\1\74\21\2\26\0\2\2\4\0"+
    "\2\2\1\75\23\2\1\76\3\2\1\77\26\0\2\2"+
    "\4\0\6\2\1\100\24\2\26\0\2\2\4\0\15\2"+
    "\1\101\1\2\1\102\13\2\26\0\2\2\4\0\11\2"+
    "\1\103\21\2\26\0\2\2\4\0\25\2\1\104\5\2"+
    "\26\0\2\2\4\0\2\2\1\105\1\106\27\2\26\0"+
    "\2\2\4\0\6\2\1\107\24\2\26\0\2\2\4\0"+
    "\3\2\1\110\11\2\1\111\15\2\26\0\2\2\4\0"+
    "\11\2\1\112\21\2\26\0\2\2\4\0\11\2\1\113"+
    "\21\2\67\0\1\114\66\0\1\57\1\115\65\0\1\57"+
    "\1\0\1\115\64\0\1\57\72\0\1\116\67\0\1\116"+
    "\61\0\1\114\6\0\1\114\57\0\1\114\7\0\1\114"+
    "\60\0\1\117\111\0\5\120\1\0\61\120\2\0\1\121"+
    "\64\0\5\56\1\0\61\56\5\60\1\0\1\122\60\60"+
    "\1\0\2\2\4\0\2\2\1\123\30\2\26\0\2\2"+
    "\4\0\21\2\1\124\11\2\26\0\2\2\4\0\12\2"+
    "\1\125\20\2\26\0\2\2\4\0\26\2\1\126\4\2"+
    "\26\0\2\2\4\0\3\2\1\127\27\2\26\0\2\2"+
    "\4\0\7\2\1\130\23\2\26\0\2\2\4\0\24\2"+
    "\1\131\6\2\26\0\2\2\4\0\4\2\1\132\26\2"+
    "\26\0\2\2\4\0\13\2\1\133\17\2\26\0\2\2"+
    "\4\0\21\2\1\134\11\2\26\0\2\2\4\0\12\2"+
    "\1\135\20\2\26\0\2\2\4\0\4\2\1\136\26\2"+
    "\26\0\2\2\4\0\25\2\1\137\5\2\26\0\2\2"+
    "\4\0\13\2\1\140\17\2\26\0\2\2\4\0\1\2"+
    "\1\141\31\2\26\0\2\2\4\0\3\2\1\142\27\2"+
    "\26\0\2\2\4\0\6\2\1\143\24\2\26\0\2\2"+
    "\4\0\12\2\1\144\20\2\26\0\2\2\4\0\1\2"+
    "\1\145\7\2\1\146\21\2\26\0\2\2\4\0\17\2"+
    "\1\147\13\2\26\0\2\2\4\0\2\2\1\150\30\2"+
    "\26\0\2\2\4\0\1\2\1\151\31\2\26\0\2\2"+
    "\4\0\4\2\1\152\26\2\26\0\2\2\4\0\3\2"+
    "\1\153\27\2\26\0\2\2\4\0\14\2\1\154\7\2"+
    "\1\155\6\2\26\0\2\2\4\0\6\2\1\156\24\2"+
    "\27\0\1\157\152\0\1\160\1\0\2\2\4\0\3\2"+
    "\1\161\27\2\26\0\2\2\4\0\11\2\1\162\21\2"+
    "\26\0\2\2\4\0\13\2\1\163\17\2\26\0\2\2"+
    "\4\0\13\2\1\164\17\2\26\0\2\2\4\0\16\2"+
    "\1\165\14\2\26\0\2\2\4\0\13\2\1\166\17\2"+
    "\26\0\2\2\4\0\1\2\1\167\23\2\1\170\5\2"+
    "\26\0\2\2\4\0\24\2\1\171\6\2\26\0\2\2"+
    "\4\0\10\2\1\172\22\2\26\0\2\2\4\0\13\2"+
    "\1\173\17\2\26\0\2\2\4\0\11\2\1\174\21\2"+
    "\26\0\2\2\4\0\1\2\1\175\31\2\26\0\2\2"+
    "\4\0\1\2\1\176\31\2\26\0\2\2\4\0\16\2"+
    "\1\177\14\2\26\0\2\2\4\0\7\2\1\200\23\2"+
    "\26\0\2\2\4\0\13\2\1\201\17\2\26\0\2\2"+
    "\4\0\13\2\1\202\17\2\26\0\2\2\4\0\6\2"+
    "\1\203\24\2\26\0\2\2\4\0\3\2\1\204\27\2"+
    "\26\0\2\2\4\0\4\2\1\124\26\2\26\0\2\2"+
    "\4\0\13\2\1\205\17\2\26\0\2\2\4\0\11\2"+
    "\1\206\21\2\26\0\2\2\4\0\13\2\1\207\17\2"+
    "\26\0\2\2\4\0\2\2\1\210\30\2\26\0\2\2"+
    "\4\0\13\2\1\211\17\2\26\0\2\2\4\0\1\2"+
    "\1\212\31\2\27\0\1\157\52\0\1\213\7\0\1\214"+
    "\2\0\2\2\4\0\4\2\1\215\26\2\26\0\2\2"+
    "\4\0\14\2\1\216\16\2\26\0\2\2\4\0\1\2"+
    "\1\217\31\2\26\0\2\2\4\0\1\2\1\220\31\2"+
    "\26\0\2\2\4\0\14\2\1\221\16\2\26\0\2\2"+
    "\4\0\3\2\1\222\27\2\26\0\2\2\4\0\11\2"+
    "\1\223\21\2\26\0\2\2\4\0\11\2\1\224\21\2"+
    "\26\0\2\2\4\0\2\2\1\225\30\2\26\0\2\2"+
    "\4\0\6\2\1\226\24\2\26\0\2\2\4\0\27\2"+
    "\1\227\3\2\26\0\2\2\4\0\13\2\1\230\17\2"+
    "\26\0\2\2\4\0\4\2\1\231\26\2\26\0\2\2"+
    "\4\0\17\2\1\232\13\2\26\0\2\2\4\0\23\2"+
    "\1\233\7\2\26\0\2\2\4\0\1\2\1\234\31\2"+
    "\26\0\2\2\4\0\2\2\1\235\30\2\26\0\2\2"+
    "\4\0\6\2\1\236\24\2\26\0\2\2\4\0\3\2"+
    "\1\237\27\2\26\0\2\2\4\0\14\2\1\240\16\2"+
    "\26\0\2\2\4\0\13\2\1\241\17\2\27\0\1\242"+
    "\65\0\2\2\4\0\11\2\1\243\21\2\26\0\2\2"+
    "\4\0\6\2\1\244\24\2\26\0\2\2\4\0\6\2"+
    "\1\245\24\2\26\0\2\2\4\0\16\2\1\246\14\2"+
    "\26\0\2\2\4\0\11\2\1\247\21\2\26\0\2\2"+
    "\4\0\30\2\1\250\2\2\26\0\2\2\4\0\1\2"+
    "\1\251\31\2\26\0\2\2\4\0\1\2\1\252\31\2"+
    "\26\0\2\2\4\0\6\2\1\253\24\2\26\0\2\2"+
    "\4\0\17\2\1\254\13\2\26\0\2\2\4\0\16\2"+
    "\1\255\14\2\26\0\2\2\4\0\11\2\1\256\21\2"+
    "\26\0\2\2\4\0\2\2\1\257\30\2\27\0\1\242"+
    "\52\0\1\260\12\0\2\2\4\0\22\2\1\261\10\2"+
    "\26\0\2\2\4\0\14\2\1\262\16\2\26\0\2\2"+
    "\4\0\4\2\1\263\26\2\26\0\2\2\4\0\31\2"+
    "\1\264\1\2\26\0\2\2\4\0\17\2\1\265\13\2"+
    "\26\0\2\2\4\0\13\2\1\266\17\2\26\0\2\2"+
    "\4\0\11\2\1\267\21\2\26\0\2\2\4\0\17\2"+
    "\1\270\13\2\26\0\2\2\4\0\11\2\1\271\21\2"+
    "\26\0\2\2\4\0\3\2\1\272\27\2\26\0\2\2"+
    "\4\0\17\2\1\273\13\2\26\0\2\2\4\0\11\2"+
    "\1\274\21\2\26\0\2\2\4\0\11\2\1\275\21\2"+
    "\26\0\2\2\4\0\13\2\1\276\17\2\26\0\2\2"+
    "\4\0\17\2\1\277\13\2\26\0\2\2\4\0\17\2"+
    "\1\300\13\2\26\0\2\2\4\0\16\2\1\301\14\2"+
    "\26\0\2\2\4\0\16\2\1\302\14\2\26\0\2\2"+
    "\4\0\1\2\1\303\31\2\26\0\2\2\4\0\6\2"+
    "\1\304\24\2\26\0\2\2\4\0\12\2\1\305\20\2"+
    "\26\0\2\2\4\0\26\2\1\306\4\2\26\0\2\2"+
    "\4\0\6\2\1\307\24\2\26\0\2\2\4\0\1\310"+
    "\32\2\26\0\2\2\4\0\11\2\1\311\21\2\26\0"+
    "\2\2\4\0\1\2\1\312\31\2\26\0\2\2\4\0"+
    "\15\2\1\313\15\2\26\0\2\2\4\0\16\2\1\314"+
    "\14\2\26\0\2\2\4\0\1\2\1\315\31\2\26\0"+
    "\2\2\4\0\17\2\1\316\13\2\26\0\2\2\4\0"+
    "\4\2\1\317\26\2\26\0\2\2\4\0\2\2\1\320"+
    "\30\2\25\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8855];
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
    "\1\0\40\1\1\0\1\1\10\11\2\0\1\1\1\11"+
    "\1\0\33\1\3\11\2\0\36\1\1\0\1\11\32\1"+
    "\1\11\1\0\25\1\1\0\15\1\1\11\40\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[208];
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
    public Symbol token(int simbolo){
		return new Symbol(simbolo,yyline,yycolumn,yytext());
	}
	public Symbol token(int simbolo,String componenteLexico){
		return new Symbol(simbolo,yyline,yycolumn,yytext());
	}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
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

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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
        case 11: 
          { return new Symbol(sym.Llave_a, yychar, yyline, yytext());
          }
        case 53: break;
        case 39: 
          { return new Symbol(sym.Cadena, yychar, yyline, yytext());
          }
        case 54: break;
        case 25: 
          { return new Symbol(sym.Int, yychar, yyline, yytext());
          }
        case 55: break;
        case 18: 
          { return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());
          }
        case 56: break;
        case 28: 
          { return new Symbol(sym.Else, yychar, yyline, yytext());
          }
        case 57: break;
        case 7: 
          { return new Symbol(sym.Op_logico, yychar, yyline, yytext());
          }
        case 58: break;
        case 49: 
          { return new Symbol(sym.RegisterA, yychar, yyline, yytext());
          }
        case 59: break;
        case 13: 
          { return new Symbol(sym.Corchete_a, yychar, yyline, yytext());
          }
        case 60: break;
        case 34: 
          { return new Symbol(sym.Admit, yychar, yyline, yytext());
          }
        case 61: break;
        case 35: 
          { return new Symbol(sym.Start, yychar, yyline, yytext());
          }
        case 62: break;
        case 20: 
          { return new Symbol(sym.Do, yychar, yyline, yytext());
          }
        case 63: break;
        case 30: 
          { return new Symbol(sym.Char, yychar, yyline, yytext());
          }
        case 64: break;
        case 36: 
          { return new Symbol(sym.Begin, yychar, yyline, yytext());
          }
        case 65: break;
        case 42: 
          { return new Symbol(sym.Device, yychar, yyline, yytext());
          }
        case 66: break;
        case 19: 
          { return new Symbol(sym.As, yychar, yyline, yytext());
          }
        case 67: break;
        case 45: 
          { return new Symbol(sym.Dispense, yychar, yyline, yytext());
          }
        case 68: break;
        case 5: 
          { return new Symbol(sym.Comillas, yychar, yyline, yytext());
          }
        case 69: break;
        case 9: 
          { return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());
          }
        case 70: break;
        case 41: 
          { return new Symbol(sym.Option, yychar, yyline, yytext());
          }
        case 71: break;
        case 52: 
          { return new Symbol(sym.DeviceControl, yychar, yyline, yytext());
          }
        case 72: break;
        case 33: 
          { return new Symbol(sym.Logic, yychar, yyline, yytext());
          }
        case 73: break;
        case 12: 
          { return new Symbol(sym.Llave_c, yychar, yyline, yytext());
          }
        case 74: break;
        case 48: 
          { return new Symbol(sym.Condition, yychar, yyline, yytext());
          }
        case 75: break;
        case 50: 
          { return new Symbol(sym.Ventilate, yychar, yyline, yytext());
          }
        case 76: break;
        case 4: 
          { return new Symbol(sym.Aritmetico, yychar, yyline, yytext());
          }
        case 77: break;
        case 14: 
          { return new Symbol(sym.Corchete_c, yychar, yyline, yytext());
          }
        case 78: break;
        case 29: 
          { return new Symbol(sym.Exit, yychar, yyline, yytext());
          }
        case 79: break;
        case 21: 
          { return new Symbol(sym.Op_incremento, yychar, yyline, yytext());
          }
        case 80: break;
        case 43: 
          { return new Symbol(sym.Declare, yychar, yyline, yytext());
          }
        case 81: break;
        case 51: 
          { return new Symbol(sym.DriverLights, yychar, yyline, yytext());
          }
        case 82: break;
        case 31: 
          { return new Symbol(sym.Case, yychar, yyline, yytext());
          }
        case 83: break;
        case 17: 
          { return new Symbol(sym.Dos_puntos, yychar, yyline, yytext());
          }
        case 84: break;
        case 40: 
          { return new Symbol(sym.Double, yychar, yyline, yytext());
          }
        case 85: break;
        case 47: 
          { return new Symbol(sym.EmptyRoom, yychar, yyline, yytext());
          }
        case 86: break;
        case 10: 
          { return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());
          }
        case 87: break;
        case 15: 
          { return new Symbol(sym.P_coma, yychar, yyline, yytext());
          }
        case 88: break;
        case 46: 
          { return new Symbol(sym.OpenDoor, yychar, yyline, yytext());
          }
        case 89: break;
        case 32: 
          { return new Symbol(sym.Atlas, yychar, yyline, yytext());
          }
        case 90: break;
        case 44: 
          { return new Symbol(sym.Distance, yychar, yyline, yytext());
          }
        case 91: break;
        case 26: 
          { return new Symbol(sym.Caracter, yychar, yyline, yytext());
          }
        case 92: break;
        case 38: 
          { return new Symbol(sym.Until, yychar, yyline, yytext());
          }
        case 93: break;
        case 3: 
          { /*Ignore*/
          }
        case 94: break;
        case 6: 
          { return new Symbol(sym.Igual, yychar, yyline, yytext());
          }
        case 95: break;
        case 16: 
          { return new Symbol(sym.Coma, yychar, yyline, yytext());
          }
        case 96: break;
        case 1: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 97: break;
        case 2: 
          { return new Symbol(sym.Numero, yychar, yyline, yytext());
          }
        case 98: break;
        case 24: 
          { return new Symbol(sym.End, yychar, yyline, yytext());
          }
        case 99: break;
        case 22: 
          { return new Symbol(sym.Numero_Dec, yychar, yyline, yytext());
          }
        case 100: break;
        case 8: 
          { return new Symbol(sym.Op_relacional, yychar, yyline, yytext());
          }
        case 101: break;
        case 37: 
          { return new Symbol(sym.Float, yychar, yyline, yytext());
          }
        case 102: break;
        case 23: 
          { return new Symbol(sym.Texto, yychar, yyline, yytext());
          }
        case 103: break;
        case 27: 
          { return new Symbol(sym.Op_booleano, yychar, yyline, yytext());
          }
        case 104: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
