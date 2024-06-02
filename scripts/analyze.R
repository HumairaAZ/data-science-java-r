args <- commandArgs(trailingOnly = TRUE)
input_file <- args[1]
output_file <- args[2]

data <- read.csv(input_file)
png(output_file)
barplot(data$Value, names.arg=data$Name, col="blue", main="Data Analysis", xlab="Name", ylab="Value")
dev.off()
