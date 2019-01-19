package com.adrianrafo.hood

data class Benchmark(
  val name: String,
  val score: Double
)

enum class BenchmarkResult {
  OK, WARN, ERROR
}

object BenchmarkInconsistencyError :Throwable("Benchmarks have differents formats and cannot be compared")