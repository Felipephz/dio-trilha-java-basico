classDiagram
    class Iphone {
    }
    Iphone ..|> ReprodutorMusical
    Iphone ..|> AparelhoTelefonico
    Iphone ..|> NavegadorInternet

    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String musica)
    }
    
    class AparelhoTelefonico {
        +ligar(String numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }
