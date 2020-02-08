package main

import "fmt"

func main() {
	sum, i, seq := 0, 2, []int{0, 1}
	for seq[len(seq)-1] < 4000000 {
		seq = append(seq, seq[i-1]+seq[i-2])
		if seq[i]%2 == 0 {
			sum += seq[i]
		}
		i++
	}
	fmt.Println("Answer:", sum)
}
