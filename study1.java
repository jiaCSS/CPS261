import java.io.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
// import java.util.ArrayList;
import java.util.Scanner;
// import java.util.*;
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;

public class study1 {

    public void processing(String inputfile) {
        Scanner scanner = null;
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        try {

            Scanner file = new Scanner(new File(inputfile));
            scanner = file;
            int goodcounter = 0;
            int badcounter = 0;
            int counters = 0;

            String outfilename = scanner.next();
//            scanner.next();

                while (scanner.hasNext()) {

                    if (scanner.hasNextInt()) {

                        int num = scanner.nextInt();
                        goodcounter++;

                        if (counters != 0){

                        numbers.add(num);

                        }

                        counters++;

                    }
                    else {
                        scanner.next();
                        System.out.println("Bad numbers in: " + outfilename);
                        badcounter++;
                    }

                }
            outputFile(outfilename, numbers);
            System.out.println("\nSummary: \ngood number is: " + goodcounter + "\nbad number is: " + badcounter);
            // System.out.println("numbers:" + numbers);

            if (!scanner.hasNext()) {

                System.out.println("finish reading " + outfilename + "\n");

            }
            file.close();

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist\n" + inputfile);
        }
    }

    public int lineCounters(String inputfile){

        int linecounters = 0;
        Scanner scanner = new Scanner(inputfile);
        while(scanner.hasNextLine()){

            scanner.nextLine();
            linecounters++;
        }
        System.out.println(linecounters);
        return linecounters;
    }
    public void outputFile(String outfilename, ArrayList<Integer> numbers) {

        try {

            FileWriter fw = new FileWriter(outfilename);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(outfilename);

            System.out.println(outfilename + " created with the following output:");

            for (int i = 0; i < numbers.size(); i++) {

                if (i % 10 == 0 && i != 0) {
                    System.out.print("\n");
//                    pw.println("\n");
                }
                if(i == 23){
                    break;
                }
                System.out.print(numbers.get(i) + " ");
//                pw.print(" " + numbers.get(i));

            }
            for (int i = 0; i< numbers.size(); i++){

                if (i%10 == 0 && i != 0 ){

                    pw.println();

                }
                pw.print(" " + numbers.get(i));
            }

            pw.close();

        } catch (IOException e) {
            System.out.print("Error: cannot write to file" + outfilename);
        }

    }

    public static void main(String[] args) {
         study1 test1 = new study1();
         test1.processing("file1.txt");
        study1 test2 = new study1();
        test2.processing("file2.txt");
         study1 test3 = new study1();
         test3.processing("file3.txt");
         study1 test4 = new study1();
         test3.processing("non-existent-file");

        // String s = "test.txt 20 30";
        // ArrayList<String> chContainer = new ArrayList<String>();
        // char[] ch = s.toCharArray();
        // Scanner scan = null;
        // scan = new Scanner(s);
        // try{

        // while (scan.hasNextLine()){
        // scan.nextInt();
        // // System.out.println(scan.nextInt());
        // System.out.println("hello world");
        // scan.close();
        // }
        // }
        // catch(InputMismatchException e){
        // // e.getStackTrace();
        // // }
        // import java.util.regex.Matcher;
        // import java.util.regex.Pattern;

        // public class RegexExamples {
        // public static void main(String[]args) {

        // }
        // }
        // ArrayList<String> letters = new ArrayList<String>();
        // ArrayList<Integer> numbers = new ArrayList<Integer>();

        // String s = "text.txt abc@ desf$ 20 30 50";
        // String ss = "text.txt abc desf$ 20 30 50";
        // char[] ch = s.toCharArray();
        // // System.out.print(ch);
        // int i = 0;
        // Pattern p = Pattern.compile("\\d+");
        // Pattern wl = Pattern.compile("\\W+");
        // Matcher ww = wl.matcher(s);
        // Matcher m = p.matcher(s);
        // while (m.find()) {
        // System.out.println(m.group());
        // int num = Integer.parseInt(m.group());
        // numbers.add(num);
        // }
        // // while (ww.find()) {
        // // System.out.println(ww.group());
        // // String ws = ww.group();
        // // letters.add(ws);
        // // }
        // String sag = s.replaceAll("[0-9]", "");
        // System.out.print("sag" + sag);

        // letters.add(sag);

        // String ssag = ss.replaceAll("[0-9]", "");
        // System.out.print("ssag" + ssag);

        // if (sag == ssag) {
        // System.out.print("True");
        // } else {
        // System.out.print("False");
        // }

        // System.out.println("letters:" + letters);

        // System.out.println(numbers);

        // Scanner scan = new Scanner(s);
        // while ( scan.hasNextLine()){

        // String lett = scan.next();
        // letters.add(lett);
        // int num = scan.nextInt();
        // numbers.add(num);
        // }
        // System.out.println("letters: " + letters);
        // System.out.println("numbers: " + numbers);

        // for (i = 0; i < s.length(); i++) {
        // // System.out.println((ch[i]));

        // if (ch[i] >= '1' || ch[i] <= '9') {
        // numbers.add((int) ch[i]);

        // } else if (ch[i] >= 'a' ||ch[i]<= 'z' || ch[i] >='A'||ch[i] <='Z' ||
        // ch[i]=='.') {
        // letters.get(i);
        // }
        // // System.out.print(numbers);
        // // System.out.print(s.charAt(i));

        // }
        // System.out.print(numbers);
        // System.out.print(letters);

    }
}