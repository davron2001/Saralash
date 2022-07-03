import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Answer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        /*
        Agar ixtiyoriy harfga ixtiyoriy harf tug'ri kelsa. Yani aniq qonuniyat bulmasa.
         */
        Map<Character, Character> map = new HashMap<>();
        map.put('a', 't');
        map.put('b', 'c');
        map.put('c', 'd');
        map.put('d', 'o');
        map.put('e', 'p');
        map.put('f', 'y');
        map.put('g', 'z');
        map.put('h', 'e');
        map.put('i', 'f');
        map.put('j', 'o');
        map.put('k', 'p');
        map.put('l', 'a');
        map.put('m', 'b');
        map.put('n', 'e');
        map.put('o', 'l');
        map.put('p', 'm');
        map.put('q', 'j');
        map.put('r', 's');
        map.put('s', 't');
        map.put('t', 'e');
        map.put('u', 'f');
        map.put('v', 'o');
        map.put('w', 'p');
        map.put('x', 'u');
        map.put('y', 'v');
        map.put('z', 'e');
        for (char c : str.toCharArray()) {
            if (map.containsKey(c))
                result.append(map.get(c));
            else result.append(c);
        }
        System.out.println(result);

        /*
        Agar ma'lum qonuniyatlar bulsa map ochish shart emas.
        Array orqali ham qilsa buladi.
         */
        int[] array = new int[26];
        for (int i = 0; i < 26; i++) {
            array[i] = 97 + i;
        }
        int qonuniyarniQadami = scanner.nextInt();
        result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                int keyingiBelgi = c + qonuniyarniQadami;
                keyingiBelgi = keyingiBelgi > 122 ? (keyingiBelgi % 122 + 97) : keyingiBelgi;
                result.append((char) keyingiBelgi);
            }
        }
        System.out.println(result.toString());
    }
}
