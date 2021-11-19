public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch= new StopWatch();


        double[] arr= new double[100000];
        for (int i=0; i< arr.length; i++){
            arr[i]= (Math.random() * 100000);
        }

        stopWatch.start();

        double minEle= arr[0];

        for (int i=0; i< arr.length - 1 ; i++){
            for (int j=i+1; j< arr.length; j++){
                if (arr[i] < arr[j]){
                    double x= arr[i];
                    arr[i]= arr[j];
                    arr[j]= x;
                }
            }
        }

        stopWatch.stop();


        System.out.println(stopWatch.getElapsedTime());







    }



}
