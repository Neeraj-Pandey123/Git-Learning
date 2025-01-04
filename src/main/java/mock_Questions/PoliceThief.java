package mock_Questions;

/**
 * Given an array of size n that has the following specifications:
 * 1. Each element in the array contains either a policeman or a thief.
 * 2. Each policeman can catch only one thief.
 * 3. A policeman cannot catch a thief who is more than K units away from the policeman.
 * Find the maximum number of thief's that can be caught.
 */
public class PoliceThief {

    public static void main(String[] args) {
        System.out.println("Main method executing.");

        String[] policeThiefArray = {"T", "T", "P", "P", "T", "P"};
        int maxPoliceReach = 2;
        PoliceThief oPt = new PoliceThief();
        oPt.findMaxThiefsCaught(policeThiefArray,maxPoliceReach);
    }

    public int findMaxThiefsCaught(String [] policeThiefArray, int maxPoliceReach) {
         int policeIndex;
        int[] thiefIndex;
        for (int index = 0; index < policeThiefArray.length; index++) {
            if (policeThiefArray[index].equals("P")) {

            }
        }
        return 0;
    }

}
