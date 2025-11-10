# Function to adjust subtitle timing by shifting the times half a second later
def shift_subtitles_half_second_later(file_path):
    with open(file_path, 'r', encoding='utf-8') as file:
        subtitles = file.readlines()
    
    pattern = re.compile(r"(\d{2}):(\d{2}):(\d{2}),(\d{3}) --> (\d{2}):(\d{2}):(\d{2}),(\d{3})")
    
    def add_half_second(hour, minute, second, millisecond):
        millisecond = int(millisecond) + 500  # Shift by half a second (500 milliseconds)
        if millisecond >= 1000:
            millisecond -= 1000
            second = int(second) + 1
            if second >= 60:
                second -= 60
                minute = int(minute) + 1
                if minute >= 60:
                    minute -= 60
                    hour = int(hour) + 1
        return f"{int(hour):02}:{int(minute):02}:{int(second):02},{int(millisecond):03}"
    
    new_subtitles = []
    
    for line in subtitles:
        match = pattern.match(line)
        if match:
            start_hour, start_minute, start_second, start_millisecond = match.groups()[:4]
            end_hour, end_minute, end_second, end_millisecond = match.groups()[4:]
            
            new_start_time = add_half_second(start_hour, start_minute, start_second, start_millisecond)
            new_end_time = add_half_second(end_hour, end_minute, end_second, end_millisecond)
            
            new_line = f"{new_start_time} --> {new_end_time}\n"
            new_subtitles.append(new_line)
        else:
            new_subtitles.append(line)
    
    new_file_path = '"C:\\Unspecified Directories Non-Impacting This PC\\Textbooks Read and Practiced\\The C Programming Language - 2th Edition - Dennis M.Ritchie\"'
    with open(new_file_path, 'w', encoding='utf-8') as new_file:
        new_file.writelines(new_subtitles)
    
    return new_file_path

# Apply the half-second timing shift
file_path_later = '"C:\\Unspecified Directories Non-Impacting This PC\\Textbooks Read and Practiced\\The C Programming Language - 2th Edition - Dennis M.Ritchie\\Ishura_E05_shifted_two_seconds_later.srt"'
shifted_file_path_half_second_later = shift_subtitles_half_second_later(file_path_later)
shifted_file_path_half_second_later
