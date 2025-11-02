class TopK {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> heap = 
        new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            heap.add(entry);
            if (heap.size() > k){
                heap.poll();
            }
        }
        int [] result = new int[k];
        int i = 0;
        while (!heap.isEmpty()){
            result[i++] = heap.poll().getKey();
        }
        return result;
    }
    public static void main(String[] args) {
        TopK topKFinder = new TopK();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] topK = topKFinder.topKFrequent(nums, k);
        System.out.println("Top " + k + " frequent elements: " + Arrays.toString(topK));
    }
}