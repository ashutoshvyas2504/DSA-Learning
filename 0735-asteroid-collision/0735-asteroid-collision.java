class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (st.isEmpty() || asteroids[i] > 0) {
                st.push(asteroids[i]);
            } else {
                while (!st.isEmpty()) {
                    int top = st.peek();
                    if (top < 0) {
                        st.push(asteroids[i]);
                        break;
                    }
                    int modVal = Math.abs(asteroids[i]);
                    if (top > modVal) {
                        break;
                    } else if (top == modVal) {
                        st.pop();
                        break;
                    } else {
                        st.pop();
                        if (st.isEmpty()) {
                            st.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        int size = st.size();
        int[] arr = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        return arr;
    }
}