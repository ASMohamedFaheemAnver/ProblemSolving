package com.freedom.hackerrank.medium;

import java.util.Arrays;
import java.util.Scanner;

public class Queens2Attack {
    // Time c : O(n), Space c : O(n^2)
    // Current solution producing memory exception
    static int queensAttack(int n, int[][] obstacles, int rq, int cq) {
        int count = 0;
        for (int y = rq - 2, x = cq - 2; ((x >= 0) && (y >= 0)); x--, y--) {
            if (obstacles[y][x] != 0) {
                break;
            }
            count++;
        }

        for (int y = rq, x = cq; ((x < n) && (y < n)); x++, y++) {
            if (obstacles[y][x] != 0) {
                break;
            }
            count++;
        }

        for (int y = rq - 2; y >= 0; y--) {
            if (obstacles[y][cq - 1] != 0) {
                break;
            }
            count++;
        }

        for (int y = rq; y < n; y++) {
            if (obstacles[y][cq - 1] != 0) {
                break;
            }
            count++;
        }

        for (int x = cq - 2; x >= 0; x--) {
            if (obstacles[rq - 1][x] != 0) {
                break;
            }
            count++;
        }

        for (int x = cq; x < n; x++) {
            if (obstacles[rq - 1][x] != 0) {
                break;
            }
            count++;
        }

        for (int y = rq - 2, x = cq; ((x < n) && (y >= 0)); x++, y--) {
            if (obstacles[y][x] != 0) {
                break;
            }
            count++;
        }

        for (int y = rq, x = cq - 2; ((x >= 0) && (y < n)); x--, y++) {
            if (obstacles[y][x] != 0) {
                break;
            }
            count++;
        }

        return count;
    }

    // I think storing 2D obstacles is the issue
    // To do
    /*
        We can keep a running closest obstacle
        for each direction(8 total) with relation to
        our queen as we read in all the obstacles from stdin
        then we can just calculate the squares covered
        using the distance between two points for each
        of the closest obstacles.
     */
    static int calculate45DegreeDistance(int rq, int cq, int ro, int co) {
        int dR = Math.abs(rq - ro);
        int dC = Math.abs(cq - co);
        return dR > dC ? dC : dR;
    }

    static int calculateCrossDistance(int rq, int cq, int ro, int co) {
        int dR = Math.abs(rq - ro);
        int dC = Math.abs(cq - co);
        return dR > dC ? dR : dC;
    }

    static boolean isInTopLeft(int rq, int cq, int ro, int co) {
        return (ro > rq) && (cq > co) && ((ro - rq) == (cq - co));
    }

    static boolean isInTop(int rq, int cq, int ro, int co) {
        return (cq == co) && (ro > rq);
    }

    static boolean isInTopRight(int rq, int cq, int ro, int co) {
        return (ro > rq) && (cq < co) && ((ro - rq) == (co - cq));
    }

    static boolean isInRight(int rq, int cq, int ro, int co) {
        return (rq == ro) && (co > cq);
    }

    static boolean isInBottomRight(int rq, int cq, int ro, int co) {
        return (rq > ro) && (co > cq) && ((co - cq) == (rq - ro));
    }

    static boolean isInBottom(int rq, int cq, int ro, int co) {
        return (rq > ro) && (co == cq);
    }

    static boolean isInBottomLeft(int rq, int cq, int ro, int co) {
        return (cq > co) && (rq > ro) && ((cq - co) == (rq - ro));
    }

    static boolean isInLeft(int rq, int cq, int ro, int co) {
        return (rq == ro) && (co < cq);
    }

    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        int rq = scanner.nextInt();
        int cq = scanner.nextInt();
        int[][] obstacles = new int[n][n];
        // Only for debugging purpose
        obstacles[rq - 1][cq - 1] = 2;
        for (int i = 0; i < k; i++) {
            obstacles[scanner.nextInt() - 1][scanner.nextInt() - 1] = 1;
        }
        System.out.println(queensAttack(n, obstacles, rq, cq));*/

        // Second approach
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();

        int rq = scanner.nextInt();
        int cq = scanner.nextInt();

        int tL = calculate45DegreeDistance(rq, cq, n, 1);
        int t = calculateCrossDistance(rq, cq, n, cq);
        int tR = calculate45DegreeDistance(rq, cq, n, n);
        int r = calculateCrossDistance(rq, cq, rq, n);
        int bR = calculate45DegreeDistance(rq, cq, 1, n);
        int b = calculateCrossDistance(rq, cq, 1, cq);
        int bL = calculate45DegreeDistance(rq, cq, 1, 1);
        int l = calculateCrossDistance(rq, cq, rq, 1);

        int[] obstaclesDistance = {tL, t, tR, r, bR, b, bL, l};

        for (int i = 0; i < k; i++) {
            int ro = scanner.nextInt();
            int co = scanner.nextInt();
            if (isInTopLeft(rq, cq, ro, co)) {
                int distance = calculate45DegreeDistance(rq, cq, ro, co) - 1;
                if (obstaclesDistance[0] > distance) {
                    obstaclesDistance[0] = distance;
                }
            } else if (isInTop(rq, cq, ro, co)) {
                int distance = calculateCrossDistance(rq, cq, ro, co) - 1;
                if (obstaclesDistance[1] > distance) {
                    obstaclesDistance[1] = distance;
                }
            } else if (isInTopRight(rq, cq, ro, co)) {
                int distance = calculate45DegreeDistance(rq, cq, ro, co) - 1;
                if (obstaclesDistance[2] > distance) {
                    obstaclesDistance[2] = distance;
                }
            } else if (isInRight(rq, cq, ro, co)) {
                int distance = calculateCrossDistance(rq, cq, ro, co) - 1;
                if (obstaclesDistance[3] > distance) {
                    obstaclesDistance[3] = distance;
                }
            } else if (isInBottomRight(rq, cq, ro, co)) {
                int distance = calculate45DegreeDistance(rq, cq, ro, co) - 1;
                if (obstaclesDistance[4] > distance) {
                    obstaclesDistance[4] = distance;
                }
            } else if (isInBottom(rq, cq, ro, co)) {
                int distance = calculateCrossDistance(rq, cq, ro, co) - 1;
                if (obstaclesDistance[5] > distance) {
                    obstaclesDistance[5] = distance;
                }
            } else if (isInBottomLeft(rq, cq, ro, co)) {
                int distance = calculate45DegreeDistance(rq, cq, ro, co) - 1;
                if (obstaclesDistance[6] > distance) {
                    obstaclesDistance[6] = distance;
                }
            } else if (isInLeft(rq, cq, ro, co)) {
                int distance = calculateCrossDistance(rq, cq, ro, co) - 1;
                if (obstaclesDistance[7] > distance) {
                    obstaclesDistance[7] = distance;
                }
            }
        }
        System.out.println(Arrays.stream(obstaclesDistance).sum());
    }


}
