package practice13.z6;

import java.io.*;
import java.util.*;

public class WordChain {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = sc.nextLine().trim();

        List<String> words = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String w : line.split("\\s+")) {
                    if (!w.isEmpty()) words.add(w);
                }
            }
        }

        System.out.println("Исходные слова: " + words);
        StringBuilder result = getLine(words);
        System.out.println("Результат: " + result);
    }

    public static StringBuilder getLine(List<String> words) {
        StringBuilder sb = new StringBuilder();
        if (words == null || words.isEmpty()) return sb;

        List<String> remaining = new ArrayList<>(words);

        for (int startIdx = 0; startIdx < words.size(); startIdx++) {
            List<String> copy = new ArrayList<>(words);
            String first = copy.remove(startIdx);
            Deque<String> chain = new ArrayDeque<>();
            chain.add(first);

            if (buildChain(chain, copy)) {
                Iterator<String> it = chain.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    if (it.hasNext()) sb.append(' ');
                }
                return sb;
            }
        }

        for (int i = 0; i < words.size(); i++) {
            sb.append(words.get(i));
            if (i < words.size() - 1) sb.append(' ');
        }
        return sb;
    }

    private static boolean buildChain(Deque<String> chain, List<String> remaining) {
        if (remaining.isEmpty()) return true;

        String last = chain.peekLast();
        char lastChar = Character.toLowerCase(last.charAt(last.length() - 1));

        for (int i = 0; i < remaining.size(); i++) {
            String candidate = remaining.get(i);
            char firstChar = Character.toLowerCase(candidate.charAt(0));
            if (firstChar == lastChar) {
                chain.addLast(candidate);
                remaining.remove(i);

                if (buildChain(chain, remaining)) return true;
                remaining.add(i, candidate);
                chain.removeLast();
            }
        }
        return false;
    }
}
