public class PascalsTriangleLC118{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int n = 0;
        while (n < numRows) {
            List<Integer> lst = new ArrayList<>();
            if (n == 0) {
                lst.add(1);//hardcoding at the first list

            } else {
               
                lst.add(1);
                int l = 0;
                
                for (int i = 1; i <= n - 1; i++) {
                    l = list.get(n - 1).get(i) + list.get(n - 1).get(i - 1);
                    lst.add(l);
                }

                lst.add(1);
            }

            n++;
            list.add(lst);
        }

        return list;

    }
}