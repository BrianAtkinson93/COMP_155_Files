public class LabTest {
    public static void main(String[] args) {
        Integer s2;
        s2 = 0;

        long start, stop, elapsed;
        start = System.nanoTime();
        long loopSize = 100_000_000;
        for (int i = 0; i < loopSize; i++) {
            s2 += 1;
        }

        stop = System.nanoTime();
        elapsed = stop - start;
        System.out.println("Test 1 (time taken) : " + elapsed + "(ns)");

        int s1;
        s1 = 0;

        start = System.nanoTime();
        for (int i = 0; i < loopSize; i++) {
            s1 += 1;
        }
        stop = System.nanoTime();
        elapsed = stop - start;
        System.out.println("Test 2 (time taken) : " + elapsed + " (ns)");
    }
}

// CPU - AMD Ryzen 5 - 3600
// Ram - G.Skillz Trident z - 3600MHz cl14


// ---------- RESULTS ----------

// TEST 1 ----------------------            Run 1           Run 2         Run 3         Run 4         Run 5        Run 6
// 50k    (AVERAGE : 2_813_720(ns))      - 2839000(ns) - 2887299(ns) - 2747600(ns) - 2810120(ns) - 2809300(ns) - 2789001(ns)
// 100k   (AVERAGE : 4_091_183.5(ns))    - 4046800(ns) - 4067300(ns) - 4261101(ns) - 4179800(ns) - 3978300(ns) - 4013800(ns)
// 500k   (AVERAGE : 6_864_600(ns))      - 6795800(ns) - 6940600(ns) - 6822700(ns) - 6921001(ns) - 6979000(ns) - 6728499(ns)
// 1Mil   (AVERAGE : 9_292_800.17(ns))   - 9424300(ns) - 9276100(ns) - 9159700(ns) - 9214801(ns) - 9389700(ns) - 9292200(ns)
// 10Mil  (AVERAGE : 41_400_917(ns))     - 41081100(ns) - 40827901(ns) - 41829101(ns) - 41656200(ns) - 41844100(ns) - 41167100(ns)
// 100Mil (AVERAGE : 291_635_016.5(ns))  - 297766199(ns) - 290566799(ns) - 292539501(ns) - 290343600(ns) - 289595800(ns) - 288998200(ns)

// TEST 2 ----------------------             Run 1           Run 2         Run 3         Run 4         Run 5        Run 6
// 50k    (AVERAGE : 413_450(ns))        - 372500(ns) - 626900(ns) - 356100(ns) - 415400(ns) - 355500(ns) - 354300(ns)
// 100k   (AVERAGE : 217_750.33..(ns))   - 206600(ns) - 204800(ns) - 205400(ns) - 282101(ns) - 203700(ns) - 203901(ns)
// 500k   (AVERAGE : 1_763_066.5(ns) )   - 1820300(ns) - 2011099(ns) - 1823100(ns) - 1682099(ns) - 1598001(ns) - 1643800(ns)
// 1Mil   (AVERAGE : 1_808_049.667(ns))  - 1676400(ns) - 1948000(ns) - 1895500(ns) - 1779700(ns) - 1747899(ns) - 1800799(ns)
// 10Mil  (AVERAGE : 5_158_900.3..(ns))  - 5049800(ns) - 5157101(ns) - 5022500(ns) - 5113801(ns) - 5642100(ns) - 4968100(ns)
// 100Mil (AVERAGE : 37_835_883 (ns))    - 37658701(ns) - 37518499(ns) - 38025999(ns) - 38345100(ns) - 38096299(ns) - 37370700(ns)

// ------------ INTERPRETATION OF RESULTS ------------
// Loop one is based on a reference type, while loop two is primitive.
// this then creates a quicker loop because it doesnt need to refer to another memory spot every iteration of the loop.
