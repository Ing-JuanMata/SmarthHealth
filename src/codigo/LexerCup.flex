package codigo;

import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t\r\n]+
%{
    public Symbol token(int simbolo){
		return new Symbol(simbolo,yyline,yycolumn,yytext());
	}
	public Symbol token(int simbolo,String componenteLexico){
		return new Symbol(simbolo,yyline,yycolumn,yytext());
	}
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}


/* Comillas */
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}

/* Clase principal */
( Atlas )    {return new Symbol(sym.Atlas, yychar, yyline, yytext());}
( End )      {return new Symbol(sym.End, yychar, yyline, yytext());}
( begin )    {return new Symbol(sym.Begin, yychar, yyline, yytext());}

/* Tipos de datos */
 ( int )     {return new Symbol(sym.Int, yychar, yyline, yytext());}
 ( char )    {return new Symbol(sym.Char, yychar, yyline, yytext());}
 ( logic )   {return new Symbol(sym.Logic, yychar, yyline, yytext());}
 ( float )   {return new Symbol(sym.Float, yychar, yyline, yytext());}
 ( double )  {return new Symbol(sym.Double, yychar, yyline, yytext());}

/* Tipo de dato String */
( Chain ) {return new Symbol(sym.Cadena, yychar, yyline, yytext());}

/* Tipo de dato Device */
( Device ) {return new Symbol(sym.Device, yychar, yyline, yytext());}



/* Palabra reservada If */
( condition ) {return new Symbol(sym.Condition, yychar, yyline, yytext());}

/* Palabra reservada Else */
( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}

/* Palabra reservada Do */
( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}


/* Palabra reservada While */
( until ) {return new Symbol(sym.Until, yychar, yyline, yytext());}


/* Palabra reservada Switch */
( option ) {return new Symbol(sym.Option, yychar, yyline, yytext());}

/* Palabra reservada Ventilar */
( ventilate ) {return new Symbol(sym.Ventilate, yychar, yyline, yytext());}


/* Palabra reservada Admit */
( admit ) {return new Symbol(sym.Admit, yychar, yyline, yytext());}


/* Palabra reservada EmptyRoom */
( emptyRoom ) {return new Symbol(sym.EmptyRoom, yychar, yyline, yytext());}


/* Palabra reservada Dispense */
( dispense ) {return new Symbol(sym.Dispense, yychar, yyline, yytext());}

/* Palabra reservada Distance  */
( distance ) {return new Symbol(sym.Distance, yychar, yyline, yytext());}

/* Palabra reservada DeviceControl  */
( deviceControl ) {return new Symbol(sym.DeviceControl, yychar, yyline, yytext());}

/* Palabra reservada DriverLights  */
( driverLights ) {return new Symbol(sym.DriverLights, yychar, yyline, yytext());}

/* Palabra reservada OpenDoor  */
( openDoor ) {return new Symbol(sym.OpenDoor, yychar, yyline, yytext());}

/* Palabra reservada RegisterA  */
( registerA ) {return new Symbol(sym.RegisterA, yychar, yyline, yytext());}

/* Palabra reservada Exit  */
( exit ) {return new Symbol(sym.Exit, yychar, yyline, yytext());}


/* Operador Igual */
( "=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/* Operadores Aritmeticos */
( "+" | "-" | "*" | "/" ) {return new Symbol(sym.Aritmetico, yychar, yyline, yytext());}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {return new Symbol(sym.Op_logico, yychar, yyline, yytext());}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Op_relacional, yychar, yyline, yytext());}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());}

/* Operadores Incremento y decremento */
( "++" | "--" ) {return new Symbol(sym.Op_incremento, yychar, yyline, yytext());}

/*Operadores Booleanos*/
( true | false ) {return new Symbol(sym.Op_booleano, yychar, yyline, yytext());}

/* Parentesis de apertura */
( "(" ) {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());}

/* Parentesis de cierre */
( ")" ) {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(sym.Llave_a, yychar, yyline, yytext());}

/* Llave de cierre */
( "}" ) {return new Symbol(sym.Llave_c, yychar, yyline, yytext());}

/* Corchete de apertura */
( "[" ) {return new Symbol(sym.Corchete_a, yychar, yyline, yytext());}

/* Corchete de cierre */
( "]" ) {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}

/* Marcador de inicio de algoritmo */
( "start" ) {return new Symbol(sym.Start, yychar, yyline, yytext());}

/* Punto y coma */
( ";" ) {return new Symbol(sym.P_coma, yychar, yyline, yytext());}

/* Coma */
( "," ) {return new Symbol(sym.Coma, yychar, yyline, yytext());}

/* Dos puntos */
( ":" ) {return new Symbol(sym.Dos_puntos, yychar, yyline, yytext());}

/* Declare y As */
( Declare )  {return new Symbol(sym.Declare, yychar, yyline, yytext());}
( As )  {return new Symbol(sym.As, yychar, yyline, yytext());}
( Case )  {return new Symbol(sym.Case, yychar, yyline, yytext());}

/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* Numero */
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

/* Numero Decimal */
("(-"{D}+\.{D}+")")|{D}+\.{D}+ {return new Symbol(sym.Numero_Dec, yychar, yyline, yytext());}

/* Texto */
( \".+\" )  {return new Symbol(sym.Texto, yychar, yyline, yytext());}

/* Caracter */
( \'.\' ) {return new Symbol(sym.Caracter, yychar, yyline, yytext());}
