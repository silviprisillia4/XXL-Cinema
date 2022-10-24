package model;

public class Movie {

        private String[] movies = { "Habibie & Ainun 3", "Dilan 1990", "Dua Garis Biru", "Ghost Writer", "Mulan",
                        "Aladdin",
                        "Spiderman: Far From Home", "It: Chapter 2", "Men In Black: International", "Joker" };
        private String[] genres = { "Drama, Roman", "Drama, Roman", "Drama, Remaja", "Drama, Horror",
                        "Laga, Petualangan",
                        "Anak-anak, Roman", "Aksi, Petualangan", "Horror, Thriller", "Aksi, Komedi",
                        "Kejahatan, Drama" };
        private String[] synopsis = {
                        "Ainun sebagai remaja seusianya memiliki kisah cinta yang unik. Ketika duduk di bangku SMA, ia dikenal sebagai sosok pintar yang menjadi"
                                        + "\nidola di sekolahnya dan menjadi incaran banyak siswa laki-laki, termasuk Habibie. Hubungan mereka dimulai dengan persahabatan. Di"
                                        + "\nperguruan tinggi, ia adalah seorang mahasiswa kedokteran dan juga sosok yang populer di lingkungan kampus. Ahmad yang berasal dari"
                                        + "\nkeluarga terpandang adalah pria yang berani mengungkapkan rasa cintanya kepada Ainun. Lalu yang membuat B.J. Habibie menjadi pelabuhan"
                                        + "\nterakhir perjalanan cinta Ainun. Kisah ini terinspirasi dari masa muda almarhum Hasri Ainun Besari Habibie dan kenangan B.J. Habibie"
                                        + "\ntentang belahan jiwanya.",
                        "Milea bertemu dengan Dilan di sebuah SMA di Bandung. Itu adalah tahun 1990, saat Milea pindah dari Jakarta ke Bandung. Perkenalan yang\ntidak biasa kemudian membawa Milea mulai mengenal keunikan Dilan lebih jauh. Dilan yang pintar, baik hati dan romantis... semua dengan"
                                        + "\ncaranya sendiri. Cara Dilan mendekati Milea tidak sama dengan teman-teman lelakinya yang lain, bahkan Beni, pacar Milea di Jakarta."
                                        + "\nBahkan cara berbicara Dilan yang terdengar kaku, lambat laun justru membuat Milea kerap merindukannya jika sehari saja ia tak mendengar"
                                        + "\nsuara itu. Perjalanan hubungan mereka tak selalu mulus. Beni, gank motor, tawuran, Anhar, Kang Adi, semua mewarnai perjalanan itu."
                                        + "\nDan Dilan... dengan caranya sendiri...selalu bisa membuat Milea percaya ia bisa tiba di tujuan dengan selamat. Tujuan dari perjalanan ini."
                                        + "\nPerjalanan mereka berdua. Katanya, dunia SMA adalah dunia paling indah. Dunia Milea dan Dilan satu tingkat lebih indah daripada itu.",
                        "Kisah asmara di usia 17 tahun membuat mereka merasa saling melengkapi, sebab mereka bisa jadi diri sendiri, kebodohan bisa ditertawakan, dan"
                                        + "\nkerapuhan tak perlu ditutupi. Namun suatu ketika, mereka melakukan hal yang di luar batas kewajaran dalam berpacaran. Keduanya harus menerima"
                                        + "\nkenyataan jika Dara tengah hamil buah cintanya dengan Bima. Di usia yang masih sangat belia, tentu dari pihak orang tua terjadi pertentangan"
                                        + "\ndan konflik, mengingat anaknya hamil di luar nikah sedangkan Bima jadi ikut bersalah. Berbeda dari cerita remaja lainnya, film ini akan lebih"
                                        + "\nbanyak menguras emosi karena tidak sebatas perjuangan cinta remaja saja.",
                        "Perjuangan Naya kian berat karena masih banyak hal-hal yang harus dikerjakan dan menjadi prioritasnya setelah buku pertamanya yang laku keras."
                                        + "\nPihak penerbit dan editor menuntut Naya untuk lebih berani menggali sebuah cerita yang baru. Naya mentok, dan ia masih berharap dari royalti"
                                        + "\ndari buku pertamanya. Di satu sisi, adiknya, Darto sedang dalam proses menuju sekolah yang baru. Semuanya itu membutuhkan biaya yang besar."
                                        + "\nMau tidak mau, Naya harus memutar otaknya. Pindah ke sebuah rumah yang baru untuk mencari ide segar tentang tulisannya yang berikutnya justru"
                                        + "\ntidak membuahkan hasil. Alih-alih mendapat ide segar, Naya harus bertemu dengan hal-hal misterius di rumah barunya. Salah satunya adalah sebuah"
                                        + "\nbuku diary yang tersimpan lusuh di loteng. Sekali menyentuh, membuka dan membaca buku lusuh tersebut, Naya harus berhadapan dengan hal-hal yang"
                                        + "\nselama ini tidak dipercayainya. Sosok “Mas Setan” akan selalu berada di sisi Naya. Tidak mengerikan, namun justru absur dan menggelikan. Bersama"
                                        + "\ndengan “Mas Setan” ini, Naya kemudian mampu menyelesaikan sebuah tulisan untuk buku barunya. Sayang, jalan Naya tidak mulus. Ia harus melanggar"
                                        + "\nkesepakatannya dengan “Mas Setan.”",
                        "Kekaisaran China mempunyai kebijakan wamil bagi setiap pria untuk tergabung ke tentara kerajaan. Ayah Mulan sendiri merupakan seorang prajurit"
                                        + "\nyang terhormat, namun saat itu ia telah jatuh sakit sehingga tidak mampu mengikuti wamil. Keluarga Mulan pun tidak memiliki laki-laki lain lagi"
                                        + "\nselain ayahnya, akhirnya Mulan menyamar menjadi laki-laki dan menggantikan ayahnya mengikuti Wamil. Namun, lika-liku untuk menggantikan sang Ayah"
                                        + "\nsangat banyak sekali. Akhirnya identitas Mulan pun terbongkar, terbongkarnya penyamaran yang dilakukan Mulan menyebabkan dirinya terancam bahaya.",
                        "Aladdin, seorang anak jalanan yang jatuh cinta pada seorang putri. Dengan perbedaan kasta dan harta, Aladdin pun berusaha mencari jalan agar bisa"
                                        + "\nmejadi seorang pangeran, tak disangka ia menemukan lampu dengan jin di dalamnya. Aladdin pun menggunakan lampu untuk mengubah dirinya menjadi"
                                        + "\nseorang pangeran untuk memenangkan hati Putri Jasmine, tapi Wazir jahat juga mengejar lampu tersebut untuk menguasai kerajaan.",
                        "Liburan santai Eropa Peter Parker berubah tak terduga ketika Nick Fury muncul di kamar hotelnya untuk merekrutnya untuk misi. Dunia dalam bahaya"
                                        + "\nkarena empat makhluk elemen masif - masing-masing mewakili Bumi, udara, air, dan api - muncul dari lubang yang robek di alam semesta. Parker"
                                        + "\nsegera menemukan dirinya mengenakan setelan Spider-Man untuk membantu Fury dan sesama pahlawan super Mysterio menghentikan entitas jahat yang"
                                        + "\nmendatangkan malapetaka di seluruh benua.",
                        "Dikalahkan oleh anggota Losers 'Club, badut jahat Pennywise kembali 27 tahun kemudian untuk meneror kota Derry, Maine, sekali lagi. Sekarang"
                                        + "\norang dewasa, teman masa kecil sudah lama berpisah. Tetapi ketika orang mulai menghilang, Mike Hanlon memanggil yang lain ke rumah untuk satu"
                                        + "\npendirian terakhir. Dirusak oleh bekas luka dari masa lalu, The Losers bersatu harus menaklukkan ketakutan terdalam mereka untuk menghancurkan"
                                        + "\nPennywise yang berubah bentuk - sekarang lebih kuat dari sebelumnya.",
                        "The Men in Black telah berkembang untuk menutupi dunia tetapi begitu juga penjahat alam semesta. Untuk menjaga keamanan semua orang, Agen H yang"
                                        + "\ndihias dan pendatang baru M yang bertekad bergabung - pasangan yang tidak mungkin itu mungkin berhasil. Ketika alien yang bisa berwujud manusia"
                                        + "\nmana pun tiba di Bumi, H dan M memulai petualangan keliling dunia untuk menyelamatkan agensi - dan akhirnya dunia - dari rencana jahat mereka.",
                        "Selamanya sendirian di tengah keramaian, komedian gagal Arthur Fleck mencari koneksi saat dia berjalan di jalanan Kota Gotham. Arthur memakai"
                                        + "\ndua topeng - yang dia lukis untuk pekerjaannya sebagai badut, dan kedok yang dia proyeksikan dalam upaya sia-sia untuk merasa seperti dia bagian"
                                        + "\ndari dunia di sekitarnya. Terisolasi, diintimidasi, dan diabaikan oleh masyarakat, Fleck mulai perlahan-lahan menjadi gila saat ia berubah menjadi"
                                        + "\ndalang kriminal yang dikenal sebagai Joker." };
        private String[] showTimes = { "10:00", "12:00", "14:00", "16:00", "18:00" };
        private int selectedMovie;
        private String time;

        public String[] getMovies() {
                return movies;
        }

        public String[] getGenres() {
                return genres;
        }

        public String[] getSynopsis() {
                return synopsis;
        }

        public String[] getShowTimes() {
                return showTimes;
        }

        public int getSelectedMovie() {
                return selectedMovie;
        }

        public void setSelectedMovie(int selectedMovie) {
                this.selectedMovie = selectedMovie;
        }

        public String getTime() {
                return time;
        }

        public void setTime(String time) {
                this.time = time;
        }

}
