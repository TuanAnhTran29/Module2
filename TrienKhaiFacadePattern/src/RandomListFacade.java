public class RandomListFacade {
    private ListFilter listFilter;
    private ListPrinter listPrinter;
    private RandomList randomList;
    private RandomNumber randomNumber;

    public RandomListFacade(RandomList randomList, ListFilter listFilter, ListPrinter listPrinter) {
        this.randomList = randomList;
        this.listFilter = listFilter;
        this.listPrinter = listPrinter;
    }


    public void printRandomEvenList(int size,int min,int max){
        listPrinter.printList(listFilter.filterOdd(randomList.generateList(size,min,max)));
    }
}
