/*
Given a string and a non-empty substring sub, compute recursively if at least
n copies of sub appear in the string somewhere, possibly with overlapping.
N will be non-negative.

strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true
*/
public boolean strCopies(String str, String sub, int n) {
  return strCopies(str, sub, n, 0);
}

private boolean strCopies(String str, String sub, int n, int tot){
  if(str.length() < sub.length()) return false;
  tot += str.substring(0, sub.length()).equals(sub) ? 1 : 0;
  return tot >= n ? true : strCopies(str.substring(1), sub, n, tot);
}
