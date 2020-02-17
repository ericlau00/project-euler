main() {
  List<int> pentagonals = List<int>();
  for (var n = 1; n < 5000; n++) {
    pentagonals.add((n * (3 * n - 1) / 2).truncate());
  }

  int smallestD = 10000000;

  for (var k = 0; pentagonals[k] < smallestD; k++) {
    for (var j = k + 1; pentagonals[j] < smallestD; j++) {
      int diff = (pentagonals[k] - pentagonals[j]).abs();
      int sum = pentagonals[k] + pentagonals[j];
      if (pentagonals.contains(sum) && pentagonals.contains(diff)) {
        if (diff < smallestD) {
          smallestD = diff;
        }
        print("BOTH: ${pentagonals[k]}, ${pentagonals[j]}, ${sum}, ${diff}");
      }
    }
  }
  print(smallestD);
}
