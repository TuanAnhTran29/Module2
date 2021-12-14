public class Main {
    public static void main(String[] args) {
        RandomListFacade randomListFacade= new RandomListFacade(new RandomList(), new ListFilter(), new ListPrinter());
        randomListFacade.printRandomEvenList(100,43,99);
    }
}
