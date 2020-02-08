package main

import (
	"fmt"
	"math"
	"strconv"
	"strings"
)

var evens []int = []int{0, 2, 4, 6, 8}

func main() {
	truncatablePrimes := []int{}
	for i := 11; len(truncatablePrimes) < 12; i += 2 {
		if !containsProblematicNumbers(i) {
			fmt.Println(i)
			if isTruncatablePrime(i) {
				truncatablePrimes = append(truncatablePrimes, i)
			}
		}
	}
	fmt.Println("Answer", sum(truncatablePrimes))
}

func sum(primes []int) int {
	total := 0
	for _, num := range primes {
		total += num
	}
	return total
}

func isLeftTruncatable(n int) (bool, int) {
	var digits int
	for ; n > 0; n /= 10 {
		digits++
		if !isPrime(n) {
			return false, digits
		}
	}
	return true, digits
}

func isRightTruncatable(n int, digits int) bool {
	for ; n > 0; n, digits = n%int(math.Pow10(digits)), digits-1 {
		if !isPrime(n) {
			return false
		}
	}
	return true
}

func containsProblematicNumbers(n int) bool {
	s := strconv.Itoa(n)
	for _, even := range evens {
		if strings.Contains(s, strconv.Itoa(even)) {
			return true
		}
	}
	if strings.Contains(s[1:len(s)-1], "5") {
		return true
	}
	if s[:1] == "1" || s[len(s)-2:] == "1" {
		return true
	}
	return false
}

func isTruncatablePrime(n int) bool {
	if isPrime(n) {
		left, digits := isLeftTruncatable(n)
		return left && isRightTruncatable(n, digits)
	}
	return false
}

func isPrime(n int) bool {
	if n < 2 {
		return false
	}
	for i := 2; i < n/2+1; i++ {
		if n%i == 0 {
			return false
		}
	}
	return true
}
