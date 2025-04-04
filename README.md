# Parallel Merge Sort in Financial Services

This repository contains a case study on implementing Parallel Merge Sort in Java, specifically designed for sorting large financial datasets. The approach leverages multi-threading to reduce execution time and utilize multi-core processors effectively.

## Table of Contents
- [Introduction](#introduction)
- [Problem Statement](#problem-statement)
- [Description](#description)
- [Applications in Financial Services](#applications-in-financial-services)
- [Challenges](#challenges)
- [Implementation Details](#implementation-details)
- [Output](#output)
- [Conclusion](#conclusion)
- [Usage](#usage)
- [License](#license)
- [Authors](#authors)

## Introduction
Parallel Merge Sort is an optimized version of the classic Merge Sort algorithm that divides data into smaller chunks and sorts them concurrently using multiple threads. This repository presents a Java implementation of the algorithm, focusing on real-time financial data processing where speed is critical.

## Problem Statement
Traditional Merge Sort operates sequentially, making it inefficient for handling vast amounts of financial data. In high-frequency trading and stock market analysis, sorting needs to be performed rapidly. This case study addresses this issue by utilizing parallel processing to improve performance.

## Description
Parallel Merge Sort in Java uses multi-threading to split an array into smaller subarrays, sort each concurrently, and merge them using a standard merge operation. The implementation uses Java’s threading mechanisms to:
- Divide the array recursively.
- Sort subarrays in parallel.
- Merge sorted arrays efficiently.

## Applications in Financial Services
The algorithm is particularly useful in financial services for:
- **Stock Order Books Processing:** Sorting buy/sell orders based on price and time priority.
- **Price History Analysis:** Detecting patterns and trends in historical stock prices.
- **Trade Execution Algorithms:** Optimizing trade execution by quickly sorting orders.
- **Risk Management:** Rapidly analyzing and sorting risk factors.
- **Portfolio Optimization:** Constructing balanced investment portfolios through efficient sorting.

## Challenges
- **Sequential Limitations:** Traditional Merge Sort does not fully utilize multi-core processors, leading to idle CPU cores.
- **Real-Time Requirements:** Financial markets demand high-speed data processing, necessitating a parallel approach.
- **Workload Distribution:** Efficiently distributing tasks across multiple threads to minimize execution time.

## Implementation Details
The solution employs the following steps:
1. **Recursive Splitting:** The input array is divided into two halves recursively.
2. **Parallel Sorting:** Each subarray is sorted in its own thread.
3. **Merging:** After sorting, threads are joined to merge the subarrays using the merge function.

## Output
The output of the program will display the unsorted and sorted arrays of stock prices, demonstrating the performance of the parallel merge sort in processing financial data.

## Conclusion
Parallel Merge Sort effectively reduces the sorting time for large datasets by leveraging multiple CPU cores. In financial services, this leads to faster real-time data processing, making it ideal for applications like stock order management, trade execution, and risk analysis.

## Usage
1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/Parallel-Merge-Sort-Financial-Services.git
   ```
2. **Compile the code:**
   ```bash
   javac FinancialSortingApp.java
   ```
3. **Run the application:**
   ```bash
   java FinancialSortingApp
   ```

## License
This project is licensed under the [MIT License](LICENSE).

## Authors
- **S. Siva Pravallika** (CB.EN.U4CSE22440)
- **Sravani Orugranti** (CB.EN.U4CSE22457)[GitHub Link](https://github.com/sravs-01)
