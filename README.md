# RAG (Retrieval-Augmented Generation)

## Project Overview
This project implements a **Retrieval-Augmented Generation (RAG)** pipeline that allows users to interact with semi-structured data from multiple PDF files. The system extracts, chunks, embeds, and stores data for efficient retrieval. The extracted data is used to answer user queries and perform comparisons using a large language model (LLM). The pipeline involves text extraction from PDFs, vector embedding for similarity-based search, and response generation with an LLM.

## Functional Requirements
1. **Data Ingestion**:
   - Extract text and relevant structured information from PDF files.
   - Segment data into logical chunks for better granularity.
   - Convert chunks into vector embeddings using a pre-trained embedding model.
   - Store embeddings in a vector database for efficient similarity-based retrieval.

2. **Query Handling**:
   - Convert user queries into vector embeddings.
   - Perform a similarity search in the vector database to retrieve the most relevant chunks.
   - Pass the retrieved chunks to the LLM to generate a detailed response.

3. **Comparison Queries**:
   - Identify and extract the relevant terms or fields for comparison across multiple PDF files.
   - Retrieve corresponding chunks from the vector database and process the data for comparison.
   - Generate a structured response (e.g., tabular or bullet-point format).

4. **Response Generation**:
   - Use the LLM with retrieval-augmented prompts to produce factual responses.
   - Ensure factuality by incorporating retrieved data directly into the response.

## Setup and Installation

### Prerequisites
- **Java JDK 8 or higher**: Required to run the project.
- **Apache PDFBox**: A library for extracting text from PDFs.
- **Vector Database**: A database to store vector embeddings for efficient similarity search (optional: use an existing solution or implement your own).

### Installation Steps
1. **Clone the Repository**:
   To clone the project repository to your local machine, run:
   ```bash
   git clone https://github.com/your-username/RAG.git
RAG/
│
├── bin/                    # Compiled class files
├── data/                   # Folder for input PDF files
├── lib/                    # External libraries (e.g., Apache PDFBox)
├── src/                    # Source code
│   ├── embeddings/         # Code for vector embedding models
│   ├── database/           # Code for handling the vector database
│   ├── ingestion/          # Code for PDF text extraction
│   ├── query/              # Code for query processing and retrieval
│   ├── response/           # Code for generating responses
│   └── main/               # Main entry point (RAGPipeline.java)
├── .gitignore              # Git ignore file to exclude unwanted files
└── README.md               # Project documentation
