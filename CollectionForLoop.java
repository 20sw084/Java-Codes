public class CollectionForLoop{
    enum Season {spring,summer,fall,winter }

    public static void main(String[] args) {
        for (Season season:Season.values())
        {
            System.out.println("The season is now "+season);
        }
    }
}
