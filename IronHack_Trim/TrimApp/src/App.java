public class App {
    // *Create a method named productFormatter that receives a String name
    // productName and a String date as parameters. This method should return the
    // productName trimmed, change spaces by _ and append the date at the end of the
    // string. The result must be given in uppercase.
    public static void main(String[] args) throws Exception {
        String aux = "hello little kid";
        String date = "11/11/1987";
        System.out.println(productFormatter1(aux, date));
        System.out.println(productFormatter(aux, date));
    }

    // FIRTS VERSION
    public static String productFormatter1(String productName, String date){
        return productName.substring(0,5).replace(" ", "_").toUpperCase() + date;
    }

    // SECOND VERSION
    public static String productFormatter(String productName, String date){
        return productName.trim().substring(0,5).replace(" ", "_").toUpperCase().concat(date);
    }
}
