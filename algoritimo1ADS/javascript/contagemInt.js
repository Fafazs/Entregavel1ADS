// Questão 6
// Dado um conjunto de dados, retorne os valores inteiros entre o primeiro elemento e o valor N.
// N pode ser um número OU um elemento existente no array.

function contarValoresInteiros(dataset, N) {
    // Verifica se o dataset é válido
    if (!Array.isArray(dataset) || dataset.length === 0) return [];

    const inicio = dataset[0];
    let limiteIndex = -1;
    let limiteValor = null;

    // Caso N seja um número que não está no array
    if (typeof N === "number" && !dataset.includes(N)) {
        limiteValor = N;
    } else {
        // Caso N seja um elemento do dataset (qualquer tipo)
        limiteIndex = dataset.indexOf(N);
        if (limiteIndex !== -1) {
            limiteValor = dataset[limiteIndex];
        } else {
            // Se não encontrar o elemento, retorna vazio
            return [];
        }
    }

    // Se o limite for numérico, filtra por faixa numérica
    if (typeof limiteValor === "number") {
        const min = Math.min(inicio, limiteValor);
        const max = Math.max(inicio, limiteValor);

        return dataset.filter(valor =>
            Number.isInteger(valor) && valor >= min && valor <= max
        );
    }

    // Se o limite não for número (ex: string, objeto, etc)
    // então usamos o índice desse elemento como referência
    if (limiteIndex !== -1) {
        // Pegamos os valores entre o índice 0 (início) e o índice do elemento N
        const subArray = dataset.slice(0, limiteIndex + 1);
        return subArray.filter(valor => Number.isInteger(valor));
    }

    return [];
}

// Testes
const dados = [2, 3.5, 4, 5, 6, "texto", 7, 8.2, 9, 10, 20, 30, "text", "ola", 33.3, 100, 22, 55, 66, 77, 88];

console.log(contarValoresInteiros(dados, 20));     // inteiros entre 2 e 20
console.log(contarValoresInteiros(dados, 6));      // inteiros entre 2 e 6
console.log(contarValoresInteiros(dados, 10));     // inteiros entre 2 e 10
console.log(contarValoresInteiros(dados, 0));      // inteiros entre 0 e 2
console.log(contarValoresInteiros(dados, "texto"));  // inteiros entre o primeiro elemento e "ola"

