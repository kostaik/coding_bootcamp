namespace Model
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;
    using System.ComponentModel.DataAnnotations.Schema;
    using System.Data.Entity.Spatial;

    [Table("Book")]
    public partial class Book
    {
        [StringLength(50)]
        public string AuthorFirstName { get; set; }

        [StringLength(50)]
        public string AuthorLastName { get; set; }

        [StringLength(50)]
        public string Title { get; set; }

        
        [StringLength(50)]
        public string BookLanguage { get; set; }

        [Key]
        [StringLength(50)]
        public string ISBN { get; set; }

        [StringLength(50)]
        public string Category { get; set; }
    }
}
