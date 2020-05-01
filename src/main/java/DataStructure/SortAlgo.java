package DataStructure;

public class SortAlgo {
    public void swap(int v[], int i, int j) {
        if(i == j)
            return;

        int tmp = v[i];
        v[i] = v[j];
        v[j] = tmp;
    }

    public void getVector(int v[]) {
        for(int i=0; i<v.length;i++)
            System.out.print("["+v[i]+"] ");
        System.out.println("");
    }

    public void bubbleSort(int v[]) {

        for(int i = v.length-1; i>0; i--) {
            for( int j = 0 ; j < i;j++) {
                if(v[j] > v[j+1]) {
                    swap(v, j, j+1);
                }
            }
        }
    }

    public void solectSort(int v[]) {
        for(int i = v.length-1; i>0; i--) {
            int max = 0;
            for(int j = 0 ; j < i; j++) {
                if(v[j] > v[max]) {
                    max = j;
                }
            }
            swap(v, max, i);
        }
    }

    public static void main(String[] args) {
        SortAlgo sort = new SortAlgo();
        int v[] = {20, 35, -15, 7, 55, 1};
        sort.getVector(v);
        sort.solectSort(v);
        sort.getVector(v);
    }

}
