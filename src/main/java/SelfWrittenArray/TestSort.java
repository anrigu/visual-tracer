//package SelfWrittenArray;
//
//public class TestSort {
//
//  public void bubbleSort(SimpleArray modArray) {
//    for (int i = 0; i < modArray.getSize(); i++) {
//      for (int j = i+1; j < modArray.getSize(); j++) {
//        if (modArray.compare(i, j) == 1) {
//          modArray.swapValues(i,j);
//        }
//      }
//    }
//  }
//
//  public static void main (String[] args) {
//    TestSort x = new TestSort();
//    int[] array = {9,8,7,6,5,4,3,2,1};
//    SimpleArray z = new RecordableArray(array);
//    x.bubbleSort(z);
//    System.out.println(z.toString());
//
//  }
//}
