public class Main {
    public static void main(String[] args) {
        int n = 3; // מספר המספרים הנרקיסיסטיים לחיפוש
        int[] narcissisticNumbers = findNarcissisticNumbers(n);

        // הדפסת המספרים הנרקיסיסטיים שנמצאו
        for (int num : narcissisticNumbers) {
            System.out.println(num);
        }
    }

    // פעולה למציאת n המספרים הנרקיסיסטיים הראשונים
    public static int[] findNarcissisticNumbers(int n) {
        // TODO: השלם את הלוגיקה למציאת המספרים הנרקיסיסטיים
        int[]arr=new int[n];
        int x=0;
        String strn;
        int plus=0;
        int index=0;
        for (int i=10;x<n;i++){
            strn=Integer.toString(i);
            int length=strn.length();
            for (int j=0;j<length;j++) {
                plus += Math.pow(strn.charAt(j), length);
            }
            if (plus==i){
                x++;
                arr[index]=i;
                index++;

            }
        }
        return arr; // החזרה זמנית
    }

}