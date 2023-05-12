////////////////////////////////////////////////////////////////////
// Davide Diotto  2042334
// Nicola Preto   2042371
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num){
        if(num<=0) return "Il numero e' negativo/nullo e quindi non e' rappresentaile\n";
        else {
            return printAsciiArt(IntegerToRoman.convert(num));
        }
    }
    private static String printAsciiArt(String romanNumber){
        String tmp="";
        for(int i=0; i<6; ++i){
            for(int j=0; j<romanNumber.length(); ++j){
                switch (romanNumber.charAt(j)){
                    case 'I':
                        switch (i){
                            case 0:
                                tmp += "  ___   ";
                                break;
                            case 1:
                                tmp += "  |_ _|   ";
                                break;
                            case 2:
                                tmp += "   | |    ";
                                break;
                            case 3:
                                tmp += "   | |    ";
                                break;
                            case 4:
                                tmp += "   | |    ";
                                break;
                            case 5:
                                tmp += "  |___|   ";
                                break;
                        }
                        break;
                    case 'V':
                        switch (i){
                            case 0:
                                tmp += "_      _";
                                break;
                            case 1:
                                tmp += "\\ \\    / /";
                                break;
                            case 2:
                                tmp += " \\ \\  / / ";
                                break;
                            case 3:
                                tmp += "  \\ \\/ /  ";
                                break;
                            case 4:
                                tmp += "   \\  /   ";
                                break;
                            case 5:
                                tmp += "    \\/    ";
                                break;
                        }
                        break;
                    case 'X':
                        switch (i){
                            case 0:
                                tmp += "  _  _  ";
                                break;
                            case 1:
                                tmp += "  \\ \\ / / ";
                                break;
                            case 2:
                                tmp += "   \\ V /  ";
                                break;
                            case 3:
                                tmp += "   > <    ";
                                break;
                            case 4:
                                tmp += "  / . \\   ";
                                break;
                            case 5:
                                tmp += " // \\\\  ";
                                break;
                        }
                        break;
                    case 'L':
                        switch (i){
                            case 0:
                                tmp += "  _       ";
                                break;
                            case 1:
                                tmp += " | |      ";
                                break;
                            case 2:
                                tmp += " | |      ";
                                break;
                            case 3:
                                tmp += " | |      ";
                                break;
                            case 4:
                                tmp += " | |__  ";
                                break;
                            case 5:
                                tmp += " |__| ";
                                break;
                        }
                        break;
                    case 'C':
                        switch (i){
                            case 0:
                                tmp += "   ___  ";
                                break;
                            case 1:
                                tmp += "  / __| ";
                                break;
                            case 2:
                                tmp += " | |      ";
                                break;
                            case 3:
                                tmp += " | |      ";
                                break;
                            case 4:
                                tmp += " | |__  ";
                                break;
                            case 5:
                                tmp += "  \\___| ";
                                break;
                        }
                        break;
                    case 'D':
                        switch (i){
                            case 0:
                                tmp += "  ___   ";
                                break;
                            case 1:
                                tmp += " | __ \\   ";
                                break;
                            case 2:
                                tmp += " | | | |  ";
                                break;
                            case 3:
                                tmp += " | | | |  ";
                                break;
                            case 4:
                                tmp += " | |__| |  ";
                                break;
                            case 5:
                                tmp += " |___/  ";
                                break;
                        }
                        break;
                    case 'M':
                        switch (i){
                            case 0:
                                tmp += "  _  _  ";
                                break;
                            case 1:
                                tmp += " |  \\/  | ";
                                break;
                            case 2:
                                tmp += " | \\  / | ";
                                break;
                            case 3:
                                tmp += " | |\\/| | ";
                                break;
                            case 4:
                                tmp += " | |  | | ";
                                break;
                            case 5:
                                tmp += " ||  || ";
                                break;
                        }
                        break;
                }
            }
            tmp += "\n";
        }
        return tmp;
    }
}