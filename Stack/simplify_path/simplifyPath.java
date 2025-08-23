class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue; 
            }
            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop(); // go up one level
                }
            } else {
                stack.push(part); // valid directory name
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String dir : stack) {
            sb.append("/").append(dir);
        }

        return sb.length() > 0 ? sb.toString() : "/";
    }
}
