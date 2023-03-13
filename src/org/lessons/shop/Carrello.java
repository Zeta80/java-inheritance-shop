package org.lessons.shop;
    import java.util.Arrays;
    import java.util.Scanner;

    public class Carrello {
        public static  Prodotto[] carrello = new Prodotto[2];

        private static Prodotto[] getCarrello() {
            return carrello;
        }

        private static  void pushIntoArray(Prodotto element) {
            if (carrello == null) {
                carrello = new Prodotto[1];
                carrello[0] = element;
            } else {
                Prodotto[] newArray = new Prodotto[carrello.length + 1];
                for (int i = 0; i < carrello.length; i++) {
                    newArray[i] = carrello[i];
                }
                newArray[carrello.length] = element;
                carrello = newArray;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //Prodotto[] carrello = new Prodotto[2];
            int numProdotti = 0;
            boolean hasTessera = false;

            while (true) {
                System.out.println("Inserire un prodotto (s per smarphone, t per televisore, c per cuffie,p per il carrello x per uscire): ");
                String tipoProdotto = scanner.nextLine();

                if (tipoProdotto.equals("x")) {
                    break;
                }

                if (tipoProdotto.equals("p")) {
                    System.out.println("ecco il tuo carrello: ");
                    System.out.println(Arrays.toString(getCarrello()));

                    break;
                }

                System.out.println("Inserire il codice: ");
                int codice = Integer.parseInt(scanner.nextLine());

                System.out.println("Inserire il nome: ");
                String nome = scanner.nextLine();

                System.out.println("Inserire la descrizione: ");
                String descrizione = scanner.nextLine();

                System.out.println("Inserire il prezzo: ");
                double prezzo = Double.parseDouble(scanner.nextLine());

                System.out.println("Inserire l'IVA: ");
                double iva = Double.parseDouble(scanner.nextLine());

                Prodotto prodotto;
                switch (tipoProdotto) {
                    case "s":
                        System.out.println("Inserire il codice IMEI: ");
                        String imei = scanner.nextLine();

                        System.out.println("Inserire la quantita' di memoria in GB: ");
                        int memoria = Integer.parseInt(scanner.nextLine());

                        prodotto = new Smartphone(codice,nome,descrizione,prezzo, iva, imei,memoria);
                        pushIntoArray(prodotto);
                        break;
                    case "t":
                        System.out.println("Inserire le dimensioni in pollici: ");
                        int dimensioni = Integer.parseInt(scanner.nextLine());

                        System.out.println("La televisione e' smart (s/n)? ");
                        boolean isSmart = scanner.nextLine().equalsIgnoreCase("s");

                        prodotto = new Televisore(codice, nome, descrizione, prezzo,iva, dimensioni, isSmart);
                        pushIntoArray(prodotto);
                        break;
                    case "c":
                        System.out.println("Inserire il colore: ");
                        String colore = scanner.nextLine();

                        System.out.println("Le cuffie sono wireless (s/n)? ");
                        boolean isWireless = scanner.nextLine().equalsIgnoreCase("s");

                        prodotto = new Cuffie(codice, nome, descrizione, prezzo,iva, colore, isWireless);
                        pushIntoArray(prodotto);
                        break;

                    default:
                        System.out.println("Tipo prodotto non valido!");
                }
            }
        }

    }
