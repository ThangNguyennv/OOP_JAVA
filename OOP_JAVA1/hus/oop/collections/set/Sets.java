    package hus.oop.collections.set;

    import java.util.ArrayList;
    import java.util.HashSet;
    import java.util.LinkedHashSet;
    import java.util.List;
    import java.util.Set;
    import java.util.TreeSet;

    public class Sets {
        public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
            Set<Integer> intersection = new HashSet<>();
            for (Integer element : first) {
                if (second.contains(element)) {
                    intersection.add(element);
                }
            }
            return intersection;
        }

        public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
            Set<Integer> union = new HashSet<>(first);
            union.addAll(second);
            return union;
        }

        public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
            Set<Integer> intersection = new HashSet<>(first);
            intersection.retainAll(second);
            return intersection;
        }

        public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
            Set<Integer> union = new HashSet<>(first);
            union.addAll(second);
            return union;
        }

        public static List<Integer> toList(Set<Integer> source) {
            List<Integer> list = new ArrayList<>(source);
            return list;
        }

        public static List<Integer> removeDuplicates(List<Integer> firstSet) {
            Set<Integer> set = new LinkedHashSet<>(firstSet);
            return new ArrayList<>(set);
        }
        
        public static List<Integer> removeDuplicatesManual(List<Integer> firstSet) {
            List<Integer> result = new ArrayList<>();
            Set<Integer> set = new HashSet<>();
            for (Integer element : firstSet) {
                if (set.add(element)) {
                    result.add(element);
                }
            }
            return result;
        }

        public static String firstRecurringCharacter(String s) {
            Set<Character> set = new HashSet<>();
            for (char c : s.toCharArray()) {
                if (set.contains(c)) {
                    return String.valueOf(c);
                }
                set.add(c);
            }
            return "";
        }

        public static Set<Character> allRecurringChars(String s) {
            Set<Character> set = new HashSet<>();
            Set<Character> recurringChars = new HashSet<>();
            for (char c : s.toCharArray()) {
                if (set.contains(c)) {
                    recurringChars.add(c);
                }
                set.add(c);
            }
            return recurringChars;
        }

        public static Integer[] toArray(Set<Integer> source) {
            Integer[] array = new Integer[source.size()];
            source.toArray(array);
            return array;
        }

        public static int getFirst(TreeSet<Integer> source) {
            return source.first();
        }

        public static int getLast(TreeSet<Integer> source) {
            return source.last();
        }
        
        public static int getGreater(TreeSet<Integer> source, int value) {
            Integer greater = source.higher(value);
            return greater != null ? greater : -1;
        }
    }
