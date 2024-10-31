
import java.time.LocalDate;
import java.time.Period;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.time.LocalDate;
import java.time.Period;

public class PenghitunganUmurHelper {
    // Menghitung umur secara detail (tahun, bulan, hari)
    public String hitungUmurDetail(LocalDate lahir, LocalDate Sekarang) {
        Period period = Period.between(lahir, Sekarang);
        return period.getYears() + "tahun, " + period.getMonths() + " bulan, " + period.getDays() + "hari";
    }
    
    // menghitung hari ulang tahun berikutnya
    public LocalDate hariUlangTahunBerikutnya(LocalDate lahir, LocalDate Sekarang){
        LocalDate ulangTahunBerikutnya =
                lahir.withYear(Sekarang.getYear());
        if (!ulangTahunBerikutnya.isAfter(Sekarang)) {
            ulangTahunBerikutnya = ulangTahunBerikutnya.plusYears(1);
        }
        return ulangTahunBerikutnya;
    }
    
    // menerjemahkan teks hari ke bahasa indonesia
    public String getDayOfWeekInIndonesia(LocalDate date) {
        switch (date.getDayOfWeek()) {
            case MONDAY:
                return "Senin";
            case TUESDAY:
                return "Selasa";
            case WEDNESDAY:
                return "Rabu";
            case THURSDAY:
                return "Kamsi";
            case FRIDAY:
                return "Jumat";
            case SATURDAY:
                return "Sabtu";
            case SUNDAY:
                return "Minggu";
            default:
                return "";
        }
    }
}