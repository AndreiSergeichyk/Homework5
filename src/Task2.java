public class Task2 {

    public static void main(String[] args) {
        String rimNumber = "MDCXIV";

        System.out.println(converterInArabNumber(rimNumber));
    }

    private static int converterInArabNumber(String rimNumber) {
        int sumArabNumber = 0;

        if (rimNumber.length() % 2 != 0) {//если колличество римских цифр нечетное, то добавляем сразу первый элемент
            sumArabNumber += getArabNumber(rimNumber.charAt(0));
        }
        for (int i = rimNumber.length() - 1; i > 0; i--) {//идем по элементам с конца
            int element = getArabNumber(rimNumber.charAt(i));//текущий элемент
            int lastElement = getArabNumber(rimNumber.charAt(i - 1));//предыдущий элемент

            if (element > lastElement) {//если текущий элемент больше предыдущего, то вычитаем их
                sumArabNumber += element - lastElement;
            } else {//иначе складываем
                sumArabNumber += element + lastElement;
            }
            i--;
        }

        return sumArabNumber;
    }

    private static int getArabNumber(char rimNumber) {
        int arabNumber = 0;
        switch (rimNumber) {
            case 'M':
                arabNumber = 1000;
                break;
            case 'D':
                arabNumber = 500;
                break;
            case 'C':
                arabNumber = 100;
                break;
            case 'L':
                arabNumber = 50;
                break;
            case 'X':
                arabNumber = 10;
                break;
            case 'V':
                arabNumber = 5;
                break;
            case 'I':
                arabNumber = 1;
                break;
        }
        return arabNumber;
    }
}
