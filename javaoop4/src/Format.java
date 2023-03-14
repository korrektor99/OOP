package javaoop4.src;
public interface Format { //интерфейс создания строк для разных форматов файла
    <T extends Task> String createString(T task);
}