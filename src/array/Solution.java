package array;

public class Solution {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        ReverseArray reverseArray = new ReverseArray();
        reverseArray.reverse(array, 0 ,array.length - 1);

        KthMaxMin kmm = new KthMaxMin();
        int[] elements = {1, 80, 3, 21, 4, 5};
        kmm.findKthMaxMinUsingHeap(elements, 2);

        Sort012Array sort = new Sort012Array();
        int[] zotArray = {0, 1, 1, 2, 0, 1, 0};
        sort.sort012Array(zotArray);

        int[] posNegs = {-3, -3,-2, 3, 4, -5, 10};
        MoveAllNegatives mvn = new MoveAllNegatives();
        mvn.moveAllNegativesWithOrder(posNegs);

        int[] ele = { -2, -3, 4, -1, -2, 1, 5, -3 };
        LargestSumContiguousSubArray lcs = new LargestSumContiguousSubArray();
        lcs.largestSumContiguousSubArray(ele);

        int[] set1 = {1, 2, 2, 3, 4};
        int[] set2 = { 2, 5, 6, 10};
        UnionAndIntersection uAndI = new UnionAndIntersection();
        uAndI.findUnionAndIntersection(set1, set2);

        int[] arrToBRotated = {1, 2, 3 ,4 ,5};
        CyclicRotateByOne cycRot = new CyclicRotateByOne();
        cycRot.rotate(arrToBRotated);

        int[] aWithDup = {1,3,4,2,3};
        FindSingleDuplicate fsd = new FindSingleDuplicate();
        System.out.println(fsd.findDuplicate(aWithDup));

        int[] arrElements = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Kadane kadane = new Kadane();
        System.out.println(kadane.kadaneAlgo(arrElements));

        int[] array1 = {1 , 4, 5, 10, 15};
        int[] array2 = {2, 3, 6, 12};
        MergeSortedArrays msa = new MergeSortedArrays();
        msa.merge(array1, array2);

        int[] arr1 = { 1, 2, 10, 15 };
        int[] arr2 = { 3, 6, 12 };
        MedianOfSortedArrays medianOfSortedArrays = new MedianOfSortedArrays();
        System.out.println(medianOfSortedArrays.findMedian(arr1, arr2));


        int[] ssArr1 = { 1, 10, 15 };
        int[] ssArr2 = { 2, 4, 6 };
        MedianOfSortedArraySameSize medianOfSortedArraySameSize = new MedianOfSortedArraySameSize();
        System.out.println(medianOfSortedArraySameSize.getMedian(ssArr1, ssArr2, 3));

        int[] a = {1, 0, 5};
        MinMergeOperationToMakePalindrome minOps = new MinMergeOperationToMakePalindrome();
        System.out.println(minOps.getOperationsCount(a));

        int[] a1 = {1, 10, 15};
        int[] a2 = {2, 3, 9};
        MergeSameSizedSortedArrays mergeSameSizedSortedArrays = new MergeSameSizedSortedArrays();
        mergeSameSizedSortedArrays.merge(a1, a2);

        int[] numbers = {2, 7, 9, 5, 8, 7, 4};
        MinSwapsToBringElementsKTogether minSwaps = new MinSwapsToBringElementsKTogether();
        System.out.println(minSwaps.minSwaps(numbers, 5));

        MergeIntervals mergeIntervals = new MergeIntervals(4);
        mergeIntervals.createInterval(1, 2);
        mergeIntervals.createInterval(2, 3);
        mergeIntervals.createInterval(2, 6);
        mergeIntervals.createInterval(5, 6);
        mergeIntervals.merge();

        int[] currPerm = {1, 2 ,4};
        NextPermutation permutation = new NextPermutation();
        permutation.findNextPermutation(currPerm);

        int[] prices = { 7, 1, 5, 6, 4 };
        int n = prices.length;
        BestTimeToBuySellStock buySellStock = new BestTimeToBuySellStock();
        System.out.println(buySellStock.maxProfit(prices , n));

        int[] arrayEle = {1, 2, 3,6, -2, 5, 7};
        FindAllPairsWithGivenSum pairs = new FindAllPairsWithGivenSum();
        pairs.printPairs(arrayEle, arrayEle.length,8);

        int[] ar1 = { 1, 5, 10, 20, 40, 80 };
        int[] ar2 = { 6, 7, 20, 80, 100 };
        int[] ar3 = { 3, 4, 15, 20, 30, 70, 80, 120 };
        FindCommonIn3SortedArray common = new FindCommonIn3SortedArray();
        common.findCommon(ar1, ar2, ar3);

        int[] shuffledArr = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };
        int size = shuffledArr.length;
        RearrangePositiveNegativeAlternatively rearrangeArray = new RearrangePositiveNegativeAlternatively();
        rearrangeArray.rearrange(shuffledArr, size);

        int[] elem = { 1,  14, 5,  20, 4, 2, 54, 20, 87, 98, 3,  1, 32 };
        ThreeWayPartitionArray partitionArray = new ThreeWayPartitionArray();
        partitionArray.partition(elem, 10, 20);

        int[] arrToFindSubArray = { 1, 4, 45, 6, 10, 19 };
        int x = 51;
        MinSubArrayGreaterThanValue subArray = new MinSubArrayGreaterThanValue();
        System.out.println(subArray.smallestSubWithSum(arrToFindSubArray, arrToFindSubArray.length, x));

        int[] arrToBringKTog = {2, 1, 5, 6, 3};
        int k = 3;
        MinSwapsToBringElementsKTogether elementsKTogether = new MinSwapsToBringElementsKTogether();
        System.out.println(elementsKTogether.minSwaps(arrToBringKTog, k));

        int[] arrToFMinHeights = { 7, 4, 8, 8, 8, 9 };
        int kVal = 6;
        MinimizeHeights minimizeHeights = new MinimizeHeights();
        System.out.println(minimizeHeights.minimizeHeightOfTowers(arrToFMinHeights, kVal));

        int[] blocks = {1, 0, 3, 0, 4, 1,2};
        TrappingRainWater rainWater = new TrappingRainWater();
        System.out.println(rainWater.findWater(blocks));
    }
}
