import java.util.*;

public class Five {
    
    static class Polynomial {
        double c, x, y, xx, xy, yy;
        
        Polynomial() {
            c = x = y = xx = xy = yy = 0;
        }
        
        // Count operations needed for this polynomial
        int countOps() {
            int ops = 0;
            int terms = 0;
            
            // Count operations for each term
            if (Math.abs(xx) > 1e-9) {
                terms++;
                ops++; // x*x
                if (Math.abs(xx - 1) > 1e-9) ops++; // coefficient
            }
            if (Math.abs(xy) > 1e-9) {
                terms++;
                ops++; // x*y
                if (Math.abs(xy - 1) > 1e-9) ops++; // coefficient
            }
            if (Math.abs(yy) > 1e-9) {
                terms++;
                ops++; // y*y
                if (Math.abs(yy - 1) > 1e-9) ops++; // coefficient
            }
            if (Math.abs(x) > 1e-9) {
                terms++;
                if (Math.abs(x - 1) > 1e-9) ops++; // coefficient
            }
            if (Math.abs(y) > 1e-9) {
                terms++;
                if (Math.abs(y - 1) > 1e-9) ops++; // coefficient
            }
            if (Math.abs(c) > 1e-9) {
                terms++;
            }
            
            // Addition operations between terms
            if (terms > 1) ops += terms - 1;
            
            return ops;
        }
    }
    
    static class ExpressionParser {
        String expr;
        int pos;
        
        ExpressionParser(String s) {
            expr = s.replaceAll("\\s+", "");
            pos = 0;
        }
        
        Polynomial parse() {
            return parseExpression();
        }
        
        Polynomial parseExpression() {
            Polynomial result = parseTerm();
            while (pos < expr.length() && expr.charAt(pos) == '+') {
                pos++;
                Polynomial term = parseTerm();
                result = add(result, term);
            }
            return result;
        }
        
        Polynomial parseTerm() {
            Polynomial result = parseFactor();
            while (pos < expr.length() && expr.charAt(pos) == '*') {
                pos++;
                Polynomial factor = parseFactor();
                result = multiply(result, factor);
            }
            return result;
        }
        
        Polynomial parseFactor() {
            if (pos < expr.length() && expr.charAt(pos) == '(') {
                pos++; // skip '('
                Polynomial result = parseExpression();
                pos++; // skip ')'
                return result;
            } else if (pos < expr.length() && Character.isDigit(expr.charAt(pos))) {
                return parseNumber();
            } else if (pos < expr.length() && expr.charAt(pos) == 'x') {
                pos++;
                Polynomial p = new Polynomial();
                p.x = 1;
                return p;
            } else if (pos < expr.length() && expr.charAt(pos) == 'y') {
                pos++;
                Polynomial p = new Polynomial();
                p.y = 1;
                return p;
            }
            return new Polynomial();
        }
        
        Polynomial parseNumber() {
            int start = pos;
            while (pos < expr.length() && Character.isDigit(expr.charAt(pos))) {
                pos++;
            }
            Polynomial p = new Polynomial();
            p.c = Double.parseDouble(expr.substring(start, pos));
            return p;
        }
        
        Polynomial add(Polynomial p1, Polynomial p2) {
            Polynomial result = new Polynomial();
            result.c = p1.c + p2.c;
            result.x = p1.x + p2.x;
            result.y = p1.y + p2.y;
            result.xx = p1.xx + p2.xx;
            result.xy = p1.xy + p2.xy;
            result.yy = p1.yy + p2.yy;
            return result;
        }
        
        Polynomial multiply(Polynomial p1, Polynomial p2) {
            Polynomial result = new Polynomial();
            result.c = p1.c * p2.c;
            result.x = p1.c * p2.x + p1.x * p2.c;
            result.y = p1.c * p2.y + p1.y * p2.c;
            result.xx = p1.c * p2.xx + p1.x * p2.x + p1.xx * p2.c;
            result.xy = p1.c * p2.xy + p1.x * p2.y + p1.y * p2.x + p1.xy * p2.c;
            result.yy = p1.c * p2.yy + p1.y * p2.y + p1.yy * p2.c;
            return result;
        }
    }
    
    // Try Form 1: (a1*x + b1)(a2*x + b2)
    static int tryForm1(Polynomial p) {
        if (Math.abs(p.xy) > 1e-9 || Math.abs(p.yy) > 1e-9 || Math.abs(p.y) > 1e-9) 
            return Integer.MAX_VALUE;
        
        double a = p.xx, b = p.x, c = p.c;
        if (Math.abs(a) < 1e-9) return Integer.MAX_VALUE;
        
        // Try factorization: find a1, a2, b1, b2
        for (int a1 = -100; a1 <= 100; a1++) {
            if (a1 == 0) continue;
            if (Math.abs(a - Math.floor(a / a1) * a1) > 1e-9) continue;
            int a2 = (int)(a / a1);
            
            for (int b1 = -100; b1 <= 100; b1++) {
                if (Math.abs(c) < 1e-9 && b1 != 0) continue;
                if (b1 != 0 && Math.abs(c - Math.floor(c / b1) * b1) > 1e-9) continue;
                int b2 = b1 == 0 ? 0 : (int)(c / b1);
                
                if (Math.abs(a1 * a2 - a) < 1e-9 && 
                    Math.abs(a1 * b2 + a2 * b1 - b) < 1e-9 && 
                    Math.abs(b1 * b2 - c) < 1e-9) {
                    return countFactorOps(a1, b1, a2, b2, 1);
                }
            }
        }
        return Integer.MAX_VALUE;
    }
    
    // Try Form 2: (a1*x + b1)(a2*y + b2)
    static int tryForm2(Polynomial p) {
        if (Math.abs(p.xx) > 1e-9 || Math.abs(p.yy) > 1e-9) 
            return Integer.MAX_VALUE;
        
        double xy = p.xy, x = p.x, y = p.y, c = p.c;
        
        for (int a1 = -100; a1 <= 100; a1++) {
            if (a1 == 0) continue;
            for (int a2 = -100; a2 <= 100; a2++) {
                if (a2 == 0) continue;
                if (Math.abs(a1 * a2 - xy) > 1e-9) continue;
                
                for (int b1 = -100; b1 <= 100; b1++) {
                    for (int b2 = -100; b2 <= 100; b2++) {
                        if (Math.abs(a1 * b2 - x) < 1e-9 && 
                            Math.abs(a2 * b1 - y) < 1e-9 && 
                            Math.abs(b1 * b2 - c) < 1e-9) {
                            return countFactorOps(a1, b1, a2, b2, 2);
                        }
                    }
                }
            }
        }
        return Integer.MAX_VALUE;
    }
    
    // Try Form 3: (a1*x + b1*y)(a2*x + b2)
    static int tryForm3(Polynomial p) {
        if (Math.abs(p.yy) > 1e-9) return Integer.MAX_VALUE;
        
        double xx = p.xx, x = p.x, xy = p.xy, y = p.y, c = p.c;
        
        for (int a1 = -100; a1 <= 100; a1++) {
            if (a1 == 0) continue;
            for (int a2 = -100; a2 <= 100; a2++) {
                if (a2 == 0) continue;
                if (Math.abs(a1 * a2 - xx) > 1e-9) continue;
                
                for (int b1 = -100; b1 <= 100; b1++) {
                    for (int b2 = -100; b2 <= 100; b2++) {
                        if (Math.abs(a1 * b2 - x) < 1e-9 && 
                            Math.abs(a2 * b1 - xy) < 1e-9 && 
                            Math.abs(b1 * b2 - y) < 1e-9) {
                            return countFactorOps(a1, b1, a2, b2, 3);
                        }
                    }
                }
            }
        }
        return Integer.MAX_VALUE;
    }
    
    static int countFactorOps(int a1, int b1, int a2, int b2, int form) {
        int ops = 0;
        
        // First bracket
        int terms1 = 0;
        if (form == 3) {
            // (a1*x + b1*y)
            if (a1 != 0) {
                terms1++;
                if (Math.abs(a1) != 1) ops++;
            }
            if (b1 != 0) {
                terms1++;
                if (Math.abs(b1) != 1) ops++;
            }
        } else {
            // (a1*x + b1) or (a1*y + b1)
            if (a1 != 0) {
                terms1++;
                if (Math.abs(a1) != 1) ops++;
            }
            if (b1 != 0) terms1++;
        }
        if (terms1 > 1) ops += terms1 - 1;
        
        // Second bracket
        int terms2 = 0;
        if (form == 2) {
            // (a2*y + b2)
            if (a2 != 0) {
                terms2++;
                if (Math.abs(a2) != 1) ops++;
            }
            if (b2 != 0) terms2++;
        } else {
            // (a2*x + b2)
            if (a2 != 0) {
                terms2++;
                if (Math.abs(a2) != 1) ops++;
            }
            if (b2 != 0) terms2++;
        }
        if (terms2 > 1) ops += terms2 - 1;
        
        // Multiplication
        ops++;
        
        return ops;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        ExpressionParser parser = new ExpressionParser(input);
        Polynomial p = parser.parse();
        
        int minOps = p.countOps();
        minOps = Math.min(minOps, tryForm1(p));
        minOps = Math.min(minOps, tryForm2(p));
        minOps = Math.min(minOps, tryForm3(p));
        
        System.out.println(minOps);
    }
}