# 📋 Checklist e Status do Projeto — Guilda 3
**Projeto:** O Arquivo Arcano — Módulo Tabela Hash  
**Disciplina:** Estrutura de Dados (GRP00524)  
**Grupo:** Guilda 3  

---

## ✅ 1. O que JÁ ESTÁ PRONTO

### 💻 Código-Fonte em Java (100% Funcional e Validado)
- **`Pergaminho.java`**: Entidade com atributos `id`, `titulo`, `categoria`, `poderMistico` e o método `toString()`.
- **`NoHash.java`**: Nó da lista encadeada simples implementado do zero.
- **`TabelaHash.java`**:
  - Função de dispersão $h(k) = |k| \bmod M$;
  - Tratamento de colisão por **Encadeamento Separado**;
  - Bloqueio de inserção de chaves duplicadas;
  - Busca com contagem de comparações e exibição do índice;
  - Remoção ajustando ponteiros da lista encadeada;
  - Exibição de todas as posições da tabela (slots ocupados e vazios);
  - Cálculo do Fator de Carga ($\alpha = N/M$);
  - Formatação e fechamento de parênteses nos comandos `printf` ajustados.
- **`Main.java`**: Roteiro do **Desafio Lúdico** com colisões intencionais conhecidas ($M = 7$), teste de duplicadas e remoção no meio de colisão.

### 📄 Documentação e Arquivos no Studio
- **`LEIA-ME.txt`**: Guia completo de compilação e execução no IntelliJ IDEA (Java 21) e terminal.
- **`Manual_do_Desenvolvedor_Guilda3.pdf`**: Relatório técnico em PDF (6 páginas) cobrindo cenário, modelagem, Big-O, gráficos e a explicação da estratégia não escolhida (**Sondagem Linear & Lápide**).
- **`Declaracao_Uso_IA_Guilda3.pdf`**: Formulário institucional de transparência de IA devidamente preenchido.

---

## ⏳ 2. O que AINDA PRECISA SER FEITO

### ✏️ 1. Retoque nos PDFs (Identificação dos Integrantes)
- [ ] Atualizar o `Manual do Desenvolvedor` e a `Declaração de IA` substituindo o nick (`jawc` / `jawc-05`) pelos **nomes completos e RAs** de todos os integrantes da Guilda 3.

### 📊 2. Slides da Apresentação
- [ ] Criar o arquivo de slides (`Slides.pdf` ou `.pptx`) para a defesa oral de 12 a 15 minutos na Aula 8, cobrindo:
  - Contexto do cenário lúdico (Biblioteca de Brasilândia);
  - Arquitetura do TAD e Encadeamento Separado;
  - Resultados do Desafio Lúdico;
  - Análise de Complexidade (Big-O) e Fator de Carga.

### 📦 3. Empacotamento do Arquivo Final (.zip)
- [ ] Compactar todos os entregáveis no arquivo **`TTG1_Grupo[3]_ED.zip`** contendo:
  - `/src` (com os arquivos `.java`);
  - `LEIA-ME.txt`;
  - `Manual_do_Desenvolvedor.pdf`;
  - `Declaracao_Uso_IA.pdf`;
  - `Slides.pdf`.

### 🎤 4. Preparação para a Defesa Oral (Aula 8)
- [ ] Divisão do tempo de fala entre todos os membros do grupo.
- [ ] Ensaio para o **"Evento do Mestre"** ao vivo (inserção, busca ou remoção de chave surpresa).
- [ ] Revisão conceitual para a arguição individual (Fator de Carga $\alpha$, número primo $M$, e complexidade média $O(1+\alpha)$ vs. pior caso $O(N)$).
