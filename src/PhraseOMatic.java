public class PhraseOMatic {

    public static void main(String[] args) {
        String[] wordListOne = {"hill","obscene","acid","combative","fork","secretary","repulsive","tenuous",
        "boot","quince","spicy","disagreeable"};
        String[] wordListTwo = {"cream","slow","star","babies","copy","worthless","good","coach","violent",
        "feigned","regret","green"};
        String[] wordListThree = {"used","choke","whistle","confess","uninterested","nippy","nimble","haircut",
        "decisive","enchanted","horn","hole"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random()) * threeLength;

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];


        System.out.println("what we need is a " + phrase);

    }
}
