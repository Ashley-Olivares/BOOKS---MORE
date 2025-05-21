// Función de búsqueda
function searchBooks() {
  const input = document.getElementById("searchInput").value.toLowerCase();
  const books = document.querySelectorAll(".book");

  books.forEach(book => {
    const title = book.querySelector("h3").textContent.toLowerCase();
    const author = book.querySelector("p").textContent.toLowerCase();

    if (title.includes(input) || author.includes(input)) {
      book.classList.remove("hidden");
    } else {
      book.classList.add("hidden");
    }
  });
}
