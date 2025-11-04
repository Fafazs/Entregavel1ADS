function fibonacci(n) {
    let sequencia = [0, 1];
    
    while (sequencia.length < n) {
      let proximo = sequencia[sequencia.length - 1] + sequencia[sequencia.length - 2];
      sequencia.push(proximo);
    }
    
    return sequencia.slice(0, n);
  }

  console.log(fibonacci(10));