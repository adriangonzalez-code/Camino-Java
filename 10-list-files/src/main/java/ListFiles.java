import java.io.File;

public class ListFiles {

    private static StringBuilder temp = new StringBuilder();

    private static String formatString(String str, int length) {
        temp.setLength(0);
        temp.append(str);

        while (temp.length() < length) {
            temp.append(' ');
        }
        return temp.toString();
    }

    public static void main(String[] args) {
        File base = new File("/home/adrian/workspace/learning/Camino-Java");
        File[] list = base.listFiles();
        int nameLength = 0;
        for (File f : list) {
            nameLength = Math.max(nameLength, f.getName().length());
        }

        nameLength += 3;

        System.out.print(formatString("Nombre", nameLength));
        System.out.print("Tipo          ");
        System.out.println("Tamaño");

        StringBuilder sb = new StringBuilder();
        while (sb.length() < nameLength) {
            sb.append('-');
        }

        sb.append("------------------");

        for (int n = 0; n < 12; n++) {
            sb.append('-');
        }

        System.out.println(sb.toString());

        for (File f : list) {
            sb.setLength(0);
            sb.append(formatString(f.getName(), nameLength));
            sb.append(f.isFile() ? "Archivo      " : "Directorio    ");
            sb.append(f.length());
            System.out.println(sb.toString());
        }
    }
}