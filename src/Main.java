public class Main {
    public static void main(String[] args) {

        //1
        String myFavouriteArtist = "Toby Fox";

        //2
        System.out.println(myFavouriteArtist);

        //3
        int myFavouriteArtistLength = myFavouriteArtist.length();

        //4
        System.out.println(myFavouriteArtist.length());

        //5
        String myFavouriteArtistUpper = myFavouriteArtist.toUpperCase();

        //6
        System.out.println(myFavouriteArtistUpper);

        //7
        String myFavouriteArtistLower = myFavouriteArtist.toLowerCase();

        //8
        System.out.println(myFavouriteArtistLower);

        //9
        String checkFor = "ift";

        //10
        boolean myFavouriteAristContains = myFavouriteArtist.contains(checkFor);

        //11
        System.out.println(myFavouriteAristContains);

        //12
        String firstName = "Renita";

        //13
        String lastName = "Tang";

        //14
        String age = "16";

        //15
        String myInfo;

        //16
        myInfo = "First Name: "+firstName+"\nLast Name: "+lastName+"\nAge: "+age+"\nFavourite Artist: "+myFavouriteArtist+"";

        //17
        System.out.println(myInfo);

        //18
        String stringToIntTest  = "16";

        //19
        int stringToIntTestStore = Integer.parseInt(stringToIntTest);

        //20
        String stringToStringTest = "" + stringToIntTest;




    }
}