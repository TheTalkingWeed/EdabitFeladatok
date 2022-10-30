import java.util.Arrays;

class Main {
 	public static void main(String[] args) {
        System.out.println(nearestChapter(new Chapter[] {
         new Chapter("Chapter 1", 1),
         new Chapter("Chapter 2", 15),
         new Chapter("Chapter 3", 37)
         }, 10));

        System.out.println(nearestChapter(new Chapter[] {
         new Chapter("New Beginnings", 1),
         new Chapter("Strange Developments", 62),
         new Chapter("The End?", 194),
         new Chapter("The True Ending", 460)
         }, 200));

        System.out.println(nearestChapter(new Chapter[] {
         new Chapter("Chapter 1a", 1),
         new Chapter("Chapter 1b", 5)
         }, 3));


	}

    public static String nearestChapter(Chapter[] chapters,int page) {
        for (int i = 1; i < chapters.length; i++)
            if ((page > chapters[i - 1].getPage()) && (page < chapters[i].getPage()))
                return page - chapters[i - 1].getPage() == chapters[i].getPage() - page ? chapters[i].getPage() > chapters[i-1].getPage() ? 
                        chapters[i].getName() : chapters[i-1].getName() : page - chapters[i - 1].getPage() > chapters[i].getPage() - page ? 
                        chapters[i].getName() : chapters[i-1].getName();
        return "None";
    }


}