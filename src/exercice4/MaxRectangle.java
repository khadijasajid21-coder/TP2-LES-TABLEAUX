package exercice4;

public class MaxRectangle {

    static class Rectangle {
        int top;
        int left;
        int bottom;
        int right;
        int area;

        @Override
        public String toString() {
            return "Rectangle [top=" + top + ", left=" + left + ", bottom=" + bottom + ", right=" + right
                    + ", area=" + area + "]";
        }
    }

   
    public static Rectangle trouverMaxRectangle(int[][] m) {
        if (m == null || m.length == 0) return null;

        int R = m.length;
        int C = m[0].length;
        Rectangle best = new Rectangle();
        best.area = 0;

        for (int top = 0; top < R; top++) {
            for (int left = 0; left < C; left++) {
                for (int bottom = top; bottom < R; bottom++) {
                    for (int right = left; right < C; right++) {
                        if (rectangleToutEnUn(m, top, left, bottom, right)) {
                            int area = (bottom - top + 1) * (right - left + 1);
                            if (area > best.area) {
                                best.area = area;
                                best.top = top;
                                best.left = left;
                                best.bottom = bottom;
                                best.right = right;
                            }
                        }
                    }
                }
            }
        }

        return best;
    }


    private static boolean rectangleToutEnUn(int[][] m, int top, int left, int bottom, int right) {
        for (int i = top; i <= bottom; i++) {
            for (int j = left; j <= right; j++) {
                if (m[i][j] != 1) return false;
            }
        }
        return true;
    }

  
    public static int maxRectangle(int[][] m) {
        Rectangle r = trouverMaxRectangle(m);
        return (r == null) ? 0 : r.area;
    }

  
    
}

