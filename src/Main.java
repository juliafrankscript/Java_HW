public class Main {
    public static void main(String[] args) {

        String[] students = {"a", "b", "c", "d"};
        double[] score = {5.1, 3.5, 2.1, 4.8};

        System.out.println(nameBestStudent(students, score));
        System.out.println(filterStudentsToString(students, score, 5.1));

    }
    public static String nameBestStudent(String[] students, double[] score) {
        if (students.length == 0) {
            return null;
        }

        double maxScore = score[0];
        int maxScoreIndex = 0;

        for (int i = 1; i < score.length; i++) {
            if (maxScore < score[i]) {
                maxScore = score[i];
                maxScoreIndex = i;
            }

        }
        return students[maxScoreIndex];
    }
        public static String filterStudentsToString (String[]students,double[] score, double border){
            String res = "";

            for (int i = 0; i < score.length; i++) {
                if (score[i] > border) {
                    if (res.length() > 0) {
                        res += ":";
                    }
                    res += students[i] + "-" + score[i];
                }
            }
            return res;
        }
    }
