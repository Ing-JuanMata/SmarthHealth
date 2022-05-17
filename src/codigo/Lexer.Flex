package codigo;

import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t\r]+
%{
    public String lexeme;
%}
%%

/* Para colorear las palabras*/
%{

public Pintar pin=new Pintar();

%}

<YYINITIAL>{
"Atlas" {pin.pintaNara(yychar,yylength()); return new Symbol(Atlas, yychar,yyline); } 
"End" {pin.pintaNara(yychar,yylength()); return new Symbol(End, yychar,yyline); } 
"begin" {pin.pintaNara(yychar,yylength()); return new Symbol(Begin, yychar,yyline); }
"int" {pin.pintaNara(yychar,yylength()); return new Symbol(Int, yychar,yyline); } 
"char" {pin.pintaNara(yychar,yylength()); return new Symbol(Char, yychar,yyline); } 
"login" {pin.pintaNara(yychar,yylength()); return new Symbol(Logic, yychar,yyline); } 
"float" {pin.pintaNara(yychar,yylength()); return new Symbol(Float, yychar,yyline); } 
"double" {pin.pintaNara(yychar,yylength()); return new Symbol(Double, yychar,yyline); } 
"condition" {pin.pintaNara(yychar,yylength()); return new Symbol(Condition, yychar,yyline); } 
"device" {pin.pintaNara(yychar,yylength()); return new Symbol(Device, yychar,yyline); }
"else" {pin.pintaNara(yychar,yylength()); return new Symbol(Else, yychar,yyline); }  
"ventilate" {pin.pintaNara(yychar,yylength()); return new Symbol(Ventilate, yychar,yyline); } 
"emtyRoom" {pin.pintaNara(yychar,yylength()); return new Symbol(EmptyRoom, yychar,yyline); } 
"declare" {pin.pintaNara(yychar,yylength()); return new Symbol(Declare, yychar,yyline); } 
"as" {pin.pintaNara(yychar,yylength()); return new Symbol(As, yychar,yyline); } 
"admit" {pin.pintaNara(yychar,yylength()); return new Symbol(Admit, yychar,yyline); } 
"dispence" {pin.pintaNara(yychar,yylength()); return new Symbol(Dispense, yychar,yyline); } 
"distance" {pin.pintaNara(yychar,yylength()); return new Symbol(Distance, yychar,yyline); } 
"do" {pin.pintaNara(yychar,yylength()); return new Symbol(Do, yychar,yyline); } 
"until" {pin.pintaNara(yychar,yylength()); return new Symbol(Until, yychar,yyline); } 
"option" {pin.pintaNara(yychar,yylength()); return new Symbol(Option, yychar,yyline); } 
"deviceControl" {pin.pintaNara(yychar,yylength()); return new Symbol(DeviceControl, yychar,yyline); } 
"driverLights" {pin.pintaNara(yychar,yylength()); return new Symbol(DriverLights, yychar,yyline); } 
"openDoor" {pin.pintaNara(yychar,yylength()); return new Symbol(OpenDoor, yychar,yyline); } 
"registerA" {pin.pintaNara(yychar,yylength()); return new Symbol(RegisterA, yychar,yyline); } 
"exit" {pin.pintaNara(yychar,yylength()); return new Symbol(Exit, yychar,yyline); } 
}  

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexeme=yytext(); return Comillas;}

/* Clase principal */
Atlas    {lexeme=yytext(); return Atlas;}
End      {lexeme=yytext(); return End;}
begin    {lexeme=yytext(); return Begin;}

/* Tipos de datos */
int     {lexeme=yytext(); return Int;}
char    {lexeme=yytext(); return Char;}
logic   {lexeme=yytext(); return Logic;}
float   {lexeme=yytext(); return Float;}
double  {lexeme=yytext(); return Double;} 

/* Tipo de dato String */
( String ) {lexeme=yytext(); return Cadena;}

/* Tipo de dato Device */
( Device ) {lexeme=yytext(); return Device;}



/* Palabra reservada If */
( condition ) {lexeme=yytext(); return Condition;}

/* Palabra reservada Else */
( else ) {lexeme=yytext(); return Else;}

/* Palabra reservada Do */
( do ) {lexeme=yytext(); return Do;}

/* Palabra reservada While */
( until ) {lexeme=yytext(); return Until;}

/* Palabra reservada Switch */
( option ) {lexeme=yytext(); return Option;}

/* Palabra reservada Ventilar */
( ventilate ) {lexeme=yytext(); return Ventilate;}

/* Palabra reservada Admit */
( admit ) {lexeme=yytext(); return Admit;}

/* Palabra reservada EmptyRoom */
( emptyRoom ) {lexeme=yytext(); return EmptyRoom;}

/* Palabra reservada Dispense */
( dispense ) {lexeme=yytext(); return Dispense;}

/* Palabra reservada Distance  */
( distance  ) {lexeme=yytext(); return Distance ;}

/* Palabra reservada DeviceControl  */
( deviceControl ) {lexeme=yytext(); return DeviceControl ;}

/* Palabra reservada DriverLights  */
( driverLights ) {lexeme=yytext(); return DriverLights ;}

/* Palabra reservada OpenDoor  */
( openDoor ) {lexeme=yytext(); return OpenDoor ;}

/* Palabra reservada RegisterA  */
( registerA ) {lexeme=yytext(); return RegisterA ;}

/* Palabra reservada Exit  */
( exit ) {lexeme=yytext(); return Exit ;}


/* Operador Igual */
( "=" ) {lexeme=yytext(); return Igual;}

/* Operadores Aritmeticos */
( "+" | "-" | "*" | "/" ) {lexeme=yytext(); return Aritmetico;}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" ) {lexeme=yytext(); return Op_logico;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=") {lexeme = yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexeme = yytext(); return Op_atribucion;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {lexeme = yytext(); return Op_incremento;}

/*Operadores Booleanos*/
(true | false)      {lexeme = yytext(); return Op_booleano;}

/* Parentesis de apertura */
( "(" ) {lexeme=yytext(); return Parentesis_a;}

/* Parentesis de cierre */
( ")" ) {lexeme=yytext(); return Parentesis_c;}

/* Llave de apertura */
( "{" ) {lexeme=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexeme=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {lexeme = yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {lexeme = yytext(); return Corchete_c;}

/* Marcador de inicio de algoritmo */
( start ) {lexeme=yytext(); return Start;}

/* Punto y coma */
( ";" ) {lexeme=yytext(); return P_coma;}

/* Coma */
( "," ) {lexeme=yytext(); return Coma;}

/* Declare y As */
Declare {lexeme=yytext(); return Declare;}
As  {lexeme=yytext(); return As;}

/* Identificador */
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}

/* Numero Decimal */
("(-"{D}+\.{D}+")")|{D}+\.{D}+ {lexeme=yytext(); return Numero_Dec;}

/* Error Identificador */
{D}+{L}+ {lexeme=yytext(); return ERROR;}

/* Texto */
\".+\" {lexeme=yytext(); return Texto;}

/* Caracter */
\'.\' {lexeme=yytext(); return Caracter;}

/* Error caracter */
\'.+\' {lexeme=yytext(); return ERROR;}

/* Error de analisis */
 . {lexeme=yytext(); return ERROR;}