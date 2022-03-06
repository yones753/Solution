package Solution_1;


public class UpdateIds {

    public static String updateId(int oldId) {
        String strId = String.valueOf(oldId),newId = "";

        for (int i = 0; i < strId.length(); i++) {
            if (i == strId.length() - (oldId / 10) % 10) {
                newId += oldId % 10;
            }
            newId += strId.charAt(i);
        }
        return newId;
    }
}
